package irvine.oeis.a065;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

import irvine.math.z.Z;
import irvine.oeis.Sequence2;
import irvine.util.string.StringUtils;

/**
 * A065023.
 * @author Sean A. Irvine
 */
public class A065023 extends Sequence2 {

  // After Jingzhe Tang, https://ideone.com/zyzaFQ

  private int mN = 1;
  private final boolean mVerbose = "true".equals(System.getProperty("oeis.verbose"));
  private final HashMap<List<Integer>, Integer> mHash = new HashMap<>();
  private final List<Integer> mDiff = new ArrayList<>();
  private final List<List<Integer>> mTrans = new ArrayList<>();
  private int mBound;

  private List<Integer> adjust(final List<Integer> mask, final int digit) {
    final List<Integer> ret = new ArrayList<>(mBound);
    for (int k = 0; k < mBound; ++k) {
      ret.add(0);
    }
    for (int i = 0; i < mBound; ++i) {
      if (mask.get(i) != 0) {
        final int pos = Math.abs(i - digit);
        if (pos < mBound) {
          ret.set(pos, 1);
        }
        if (i + digit < mBound) {
          ret.set(i + digit, 1);
        }
      }
    }
    return ret;
  }

  private int dfs(final List<Integer> cur) {
    final Integer iter = mHash.get(cur);
    if (iter != null) {
      return iter;
    }
    final int idx = mHash.size();
    mHash.put(cur, idx);
    if (mVerbose && mHash.size() % 100000 == 0) {
      StringUtils.message("collected " + mHash.size() + " states");
    }
    for (int i = 0; i < mN; ++i) {
      if (cur.size() > i && cur.get(i) != 0) {
        mDiff.add(i);
        break;
      }
    }
    mTrans.add(new ArrayList<>());
    for (int i = 0; i < mN; ++i) {
      mTrans.get(idx).add(dfs(adjust(cur, i)));
    }
    return idx;
  }

  private long solve(final int base) {
    mBound = (base - 1) * (base - 2) + 1;

    List<Integer> origin = new ArrayList<>(mBound);
    origin.add(1);
    for (int k = 1; k < mBound; ++k) {
      origin.add(0);
    }
    dfs(origin);
    if (mVerbose) {
      StringUtils.message("collected " + mHash.size() + " states");
    }

    int size = base;
    List<Integer> pos = new ArrayList<>(mDiff);
    for (int i = 0; i < base; ++i) {
      final List<Integer> pos2 = new ArrayList<>();
      final HashMap<List<Integer>, Integer> hash2 = new HashMap<>();
      for (int j = 0; j < mHash.size(); ++j) {
        final List<Integer> vec = new ArrayList<>();
        if (j < mDiff.size()) {
          vec.add(mDiff.get(j));
        }
        final List<Integer> t = mTrans.get(j);
        for (int k = 0; k < base; ++k) {
          final int u = t.get(k);
          if (u < pos.size()) {
            vec.add(pos.get(u));
          }
        }
        final Integer value = hash2.get(vec);
        if (value != null) {
          pos2.add(value);
        } else {
          final int idx = hash2.size();
          hash2.put(vec, idx);
          pos2.add(idx);
        }
      }
      if (size == hash2.size()) {
        break;
      }
      if (mVerbose) {
        StringUtils.message("distinct states: " + size + " -> " + hash2.size());
      }
      size = hash2.size();
      pos = pos2;
    }
    return size;
  }

  @Override
  public Z next() {
    mHash.clear();
    mDiff.clear();
    mTrans.clear();
    return Z.valueOf(solve(++mN));
  }
}

