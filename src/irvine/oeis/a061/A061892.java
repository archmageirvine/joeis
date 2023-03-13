package irvine.oeis.a061;

import java.util.ArrayList;
import java.util.List;

import irvine.math.z.Z;
import irvine.oeis.Sequence0;

/**
 * A061859.
 * @author Sean A. Irvine
 */
public class A061892 extends Sequence0 {

  // Only good for a few terms

  private final int[] mInitial;
  private List<Integer> mA = null;

  protected A061892(final int... initial) {
    mInitial = initial;
  }

  /** Construct the sequence. */
  public A061892() {
    this(1, 0, 0);
  }

  private List<Integer> play(final List<Integer> a) {
    final ArrayList<Integer> res = new ArrayList<>();
    for (int k = a.size() - 1, i = 1; k >= 0; --k, ++i) {
      final int cnt = a.get(k);
      for (int j = 0; j < cnt; ++j) {
        res.add(i);
      }
    }
    return res;
  }

  @Override
  public Z next() {
    if (mA == null) {
      mA = new ArrayList<>();
      for (final int v : mInitial) {
        mA.add(v);
      }
    } else {
      mA = play(mA);
    }
    return Z.valueOf(mA.get(mA.size() - 1));
  }
}
