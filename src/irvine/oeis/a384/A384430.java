package irvine.oeis.a384;

import java.util.ArrayList;

import irvine.math.predicate.Predicates;
import irvine.math.z.Z;
import irvine.oeis.Sequence1;
import irvine.util.array.DynamicLongArray;
import irvine.util.string.StringUtils;

/**
 * A384430 allocated for Zhining Yang.
 * @author Sean A. Irvine
 */
public class A384430 extends Sequence1 {

  private final boolean mVerbose = "true".equals(System.getProperty("oeis.verbose"));
  private final DynamicLongArray mFirsts = new DynamicLongArray();
  private int mN = 0;
  private long mM = 2;
  private final ArrayList<Z> mCubes = new ArrayList<>();

  private Z cube(final int n) {
    while (n >= mCubes.size()) {
      mCubes.add(Z.valueOf(mCubes.size()).pow(3));
    }
    return mCubes.get(n);
  }

  @Override
  public Z next() {
    ++mN;
    while (mFirsts.get(mN) == 0) {
      int cnt = 0;
      final Z m5 = Z.valueOf(++mM).pow(5);
      for (int x = 1; cube(x).multiply(4).compareTo(m5) < 0; ++x) {
        final Z a = m5.subtract(cube(x));
        for (int y = x + 1; cube(y).multiply(3).compareTo(a) < 0; ++y) {
          final Z b = a.subtract(cube(y));
          for (int z = y + 1; cube(z).multiply2().compareTo(b) < 0; ++z) {
            final Z c = b.subtract(cube(z));
            if (Predicates.CUBE.is(c)) {
              ++cnt;
            }
          }
        }
      }
      if (mFirsts.get(cnt) == 0) {
        if (mVerbose) {
          StringUtils.message("First k with " + cnt + " solutions is " + mM);
        }
        mFirsts.set(cnt, mM);
      }
    }
    return Z.valueOf(mFirsts.get(mN));
  }
}

