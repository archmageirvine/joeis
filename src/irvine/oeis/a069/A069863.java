package irvine.oeis.a069;

import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A069863 a(n) is the shortest concatenation of two or more decreasing consecutive numbers (n)(n-1)...(0) such that n divides a(n), or n if there is no such concatenation.
 * @author Sean A. Irvine
 */
public class A069863 extends Sequence1 {

  private long mM = 10;
  private long mN = 0;

  @Override
  public Z next() {
    if (++mN == mM) {
      mM *= 10;
    }
    long k = mN;
    Z t = Z.valueOf(k);
    long m = mM;
    long mm = m / 10;
    do {
      if (--k < 0) {
        return Z.valueOf(mN); // no solution
      }
      if (k != 0 && k < mm) {
        m = mm;
        mm /= 10;
      }
      t = t.multiply(m).add(k);
    } while (t.mod(mN) != 0);
    return t;
  }
}

