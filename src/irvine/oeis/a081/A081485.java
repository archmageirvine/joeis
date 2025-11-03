package irvine.oeis.a081;

import irvine.factor.prime.Fast;
import irvine.math.function.Functions;
import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A081485 Triangle read by rows in which the n-th row contains the smallest set of n coprime numbers with a sum which is a multiple of n.
 * @author Sean A. Irvine
 */
public class A081485 extends Sequence1 {

  // After Franklin T. Adams-Watters

  private final Fast mPrime = new Fast();
  protected Z[] mRow = {};
  private int mN = 0;
  private int mM = 0;

  protected void step() {
    if (++mN == 1) {
      mRow = new Z[] {Z.ONE};
    } else if (mN == 2) {
      mRow = new Z[] {Z.ONE, Z.THREE};
    } else if (mN == 3) {
      mRow = new Z[] {Z.ONE, Z.TWO, Z.THREE};
    } else {
      mRow = new Z[mN];
      mRow[0] = Z.ONE;
      mRow[1] = (mN & 1) == 0 ? Z.THREE : Z.TWO;
      Z t = mRow[1].add(1);
      for (int k = 2; k <= mN - 3; ++k) {
        mRow[k] = mPrime.nextPrime(mRow[k - 1]);
        t = t.add(mRow[k]);
      }
      Z p = mPrime.nextPrime(mRow[mN - 3]);
      while (Functions.GCD.l(t.add(p), mN) > 1) {
        p = mPrime.nextPrime(p);
      }
      mRow[mN - 2] = p;
      t = t.add(p);
      Z r = p.divide(mN).multiply(mN).subtract(t.mod(mN));
      while (r.compareTo(p) <= 0) {
        r = r.add(mN);
      }
      while (!r.isProbablePrime()) {
        r = r.add(mN);
      }
      mRow[mN - 1] = r;
    }
  }

  @Override
  public Z next() {
    if (++mM >= mN) {
      mM = 0;
      step();
    }
    return mRow[mM];
  }
}
