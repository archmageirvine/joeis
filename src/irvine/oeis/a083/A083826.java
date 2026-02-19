package irvine.oeis.a083;

import irvine.math.z.Z;
import irvine.oeis.Conjectural;
import irvine.oeis.Sequence1;

/**
 * A083826 Smallest k such that k+ 9*(A000042(n-1)*{n, mod 10) is digit reversal of k. A000042(n) = (10^n-1)/9.,a(10n) = 0.
 * @author Sean A. Irvine
 */
public class A083826 extends Sequence1 implements Conjectural {

  // todo this sequence has a bogus definition

  private long mN = 0;

  @Override
  public Z next() {
    long r = ++mN % 10;
    if (r == 0) {
      return Z.ZERO;
    }
    if (mN == 1) {
      return Z.valueOf(12);
    }

    long m = (mN - 1) / 10;
    Z p = Z.TEN.pow(m + 1);
    if (r == 9) {
      return p.multiply(9);
    }
    if (r == 1) {
      return p;
    }
    return p.add(r + 1);
  }
}
