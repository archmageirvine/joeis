package irvine.oeis.a063;

import irvine.math.cr.CR;
import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A063529 a(n) = M(2^n-1), where M() is A029834, a discrete version of the Mangoldt function: if n is prime then floor(log(n)) else 0 and 2^n-1 is A000225.
 * @author Sean A. Irvine
 */
public class A063529 extends Sequence1 {

  private int mN = 0;

  @Override
  public Z next() {
    final Z t = Z.ONE.shiftLeft(++mN).subtract(1);
    return t.isProbablePrime() ? CR.valueOf(t).log().floor() : Z.ZERO;
  }
}
