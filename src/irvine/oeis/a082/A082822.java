package irvine.oeis.a082;

import java.util.TreeSet;

import irvine.math.function.Functions;
import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A082822 Triangle (with distinct entries) read by rows in which row n contains n numbers whose product == 1 (mod n).
 * @author Sean A. Irvine
 */
public class A082822 extends Sequence1 {

  private final TreeSet<Long> mUsed = new TreeSet<>();
  private long mLeastUnused = 2;
  private long mProd = 1;
  private int mN = 1;
  private int mM = 0;

  @Override
  public Z next() {
    if (mN == 1) {
      mN = 2;
      return Z.ONE;
    }
    while (mUsed.remove(mLeastUnused)) {
      ++mLeastUnused;
    }
    long k = mLeastUnused;
    if (++mM >= mN) {
      // Complete the row
      while (true) {
        if (!mUsed.contains(k) && (mProd * k) % mN == 1) {
          mUsed.add(k);
          mProd = 1;
          mM = 0;
          ++mN;
          return Z.valueOf(k);
        }
        ++k;
      }
    } else {
      while (mUsed.contains(k) || Functions.GCD.l(k, mN) > 1) {
        ++k;
      }
      mUsed.add(k);
      mProd *= k;
      mProd %= mN;
      return Z.valueOf(k);
    }
  }
}
