package irvine.oeis.a060;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import irvine.math.IntegerUtils;
import irvine.math.api.Group;
import irvine.math.group.GroupFactory;
import irvine.math.z.Z;
import irvine.oeis.Sequence;
import irvine.util.string.StringUtils;

/**
 * A060020.
 * @author Sean A. Irvine
 */
public class A060020 implements Sequence {

  private final boolean mVerbose = "true".equals(System.getProperty("oeis.verbose"));
  private int mN = 1;

  private Group<Object> mG = null;
  private final Map<Object, Integer> mId = new HashMap<>();
  private final List<Object> mElement = new ArrayList<>();
  private int[] mMarkers = null;
  private int mMax = 0;

  private void search(final int pos, final int setSize, final int spannedCount) {
    //System.out.println("|G|=" + mG.size() + " " + mG + " pos=" + pos + " setSize=" + setSize + " span=" + spannedCount + " " + Arrays.toString(mMarkers));
    if (spannedCount >= mMarkers.length) {
      return; // Entire group is spanned, don't search any further
    }
    if (setSize > mMax) {
      mMax = setSize; // New record set size that does not span the group
    }
    for (int k = pos; k < mMarkers.length; ++k) {
      final List<Integer> undoList = new ArrayList<>();
      undoList.add(k);
      final Object e = mElement.get(k);
      int sc = spannedCount;
      for (int j = 0; j < mMarkers.length; ++j) {
        if (mMarkers[j] > 0) {
          final int t = mId.get(mG.add(e, mElement.get(j)));
          if (mMarkers[t] == 0) {
            undoList.add(t);
          }
        }
      }
      for (final int v : undoList) {
        if (mMarkers[v] == 0) {
          ++sc;
        }
        ++mMarkers[v];
      }
      search(k + 1, setSize + 1, sc);
      for (final int v : undoList) {
        --mMarkers[v];
      }
    }
  }

  @SuppressWarnings("unchecked")
  private long maxSpanningSize(final Group<?> g) {
    mG = (Group<Object>) g;
    mId.clear();
    mElement.clear();
    int k = -1;
    for (final Object e : g) {
      mId.put(e, ++k);
      mElement.add(e);
    }
    assert mId.size() == g.size().intValueExact();
    mMarkers = new int[mId.size()];
    mMax = 0;
    // In this version we assume the identity is always in the set
    assert mId.get(g.zero()) == 0;
    ++mMarkers[0];
    search(1, 1, 1);
    --mMarkers[0];
    assert IntegerUtils.isZero(mMarkers); // Proves search behaved well
    return mMax;
  }

  @Override
  public Z next() {
    ++mN;
    if (mN >= 10 && (mN & 1) == 0) {
      return Z.valueOf(mN / 2); // Theorem Griggs
    }
    // There are other applicable Theorems that could handle many other cases,
    // but here we use an explicit construction of the relevant spanning sets.
    long max = 0;
    for (final Group<?> g : GroupFactory.smallGroups(mN)) {
      if (g.isAbelian()) {
        final long m = maxSpanningSize(g);
        if (mVerbose) {
          StringUtils.message(g + " with size " + g.size() + " has max " + m);
        }
        if (m > max) {
          max = m;
        }
      }
    }
    return Z.valueOf(max);
  }
}
