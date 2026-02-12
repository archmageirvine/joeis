package irvine.oeis.a083;

import irvine.math.function.Functions;
import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A083773 The n-th row of the following triangle contains n distinct numbers such that the product of (n-1) of them + 1 is always a prime. The first (n-1) numbers are the smallest set whose product +1 is a prime and the n-th term is chosen to satisfy the requirement. a(1) = 1 by convention. Sequence contains the triangle by rows.
 * @author Sean A. Irvine
 */
public class A083773 extends Sequence1 {

  private int mN = -1;
  private int mM = 0;

  @Override
  public Z next() {
    if (mN == -1) {
      ++mN;
      return Z.ONE;
    }
    if (mN == 0) {
      final Z res = Z.valueOf(++mM);
      if (mM > 1) {
        ++mN;
        mM = 0;
      }
      return res;
    }
    if (mM < mN) {
      return Z.valueOf(++mM);
    }
    // Second to last term of row
    final Z fac = Functions.FACTORIAL.z(mN);
    if (mM == mN) {
      while (!fac.multiply(++mM).add(1).isProbablePrime()) {
        // do nothing
      }
      return Z.valueOf(mM);
    }
    // Final term of the row
    boolean fails = true;
    final Z fi = fac.multiply(mM);
    long j = mM;
    while (fails) {
      ++j;
      final Z t = fi.multiply(j);
      fails = !fac.multiply(j).add(1).isProbablePrime();
      long k = 1;
      while (!fails && k <= mN) {
        if (t.divide(k).add(1).isProbablePrime()) {
          ++k;
        } else {
          fails = true;
        }
      }
    }
    mM = 0;
    ++mN;
    return Z.valueOf(j);
  }
}
