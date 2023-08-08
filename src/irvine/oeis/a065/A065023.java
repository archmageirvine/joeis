package irvine.oeis.a065;

import java.util.ArrayList;
import java.util.BitSet;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Objects;

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
  private final HashMap<BitSet, Integer> mHash = new HashMap<>();
  private final List<Integer> mDiff = new ArrayList<>();
  private final List<List<Integer>> mTrans = new ArrayList<>();
  private int mBound;

  private BitSet adjust(final BitSet mask, final int digit) {
    final BitSet ret = new BitSet(mBound);
    for (int k = mask.nextSetBit(0); k >= 0; k = mask.nextSetBit(k + 1)) {
      final int pos = Math.abs(k - digit);
      if (pos < mBound) {
        ret.set(pos);
      }
      if (k + digit < mBound) {
        ret.set(k + digit);
      }
    }
    return ret;
  }

  private int dfs(final BitSet cur) {
    final int idx = mHash.size();
    final Integer v = mHash.putIfAbsent(cur, idx);
    if (v != null) {
      return v;
    }
    if (mVerbose && mHash.size() % 100000 == 0) {
      StringUtils.message("collected " + mHash.size() + " states");
    }
    for (int k = 0; k < Math.min(mN, cur.size()); ++k) {
      if (cur.get(k)) {
        mDiff.add(k);
        break;
      }
    }
    final List<Integer> lst = new ArrayList<>();
    mTrans.add(lst);
    for (int i = 0; i < mN; ++i) {
      lst.add(dfs(adjust(cur, i)));
    }
    return idx;
  }

  private long solve(final int base) {
    mBound = (base - 1) * (base - 2) + 1;
    final BitSet origin = new BitSet(mBound);
    origin.set(0);
    dfs(origin);
    if (mVerbose) {
      StringUtils.message("collected " + mHash.size() + " states");
    }

    int size = base;
    List<Integer> pos = new ArrayList<>(mDiff);
    for (int i = 0; i < base; ++i) {
      final List<Integer> pos2 = new ArrayList<>();
      final Map<List<Integer>, Integer> hash2 = new HashMap<>();
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
        final int idx = hash2.size();
        pos2.add(Objects.requireNonNullElse(hash2.putIfAbsent(vec, idx), idx));
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

