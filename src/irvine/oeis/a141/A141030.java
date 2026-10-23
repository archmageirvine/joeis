package irvine.oeis.a141;

import irvine.math.cr.CR;
import irvine.math.z.Z;
import irvine.oeis.a000.A000040;

/**
 * A141030 a(n) is the class of prime(n) according to the rule given in comments.
 * @author Sean A. Irvine
 */
public class A141030 extends A000040 {

  private static final CR SQRT5 = CR.FIVE.sqrt();
  private static final CR SQRT7 = CR.SEVEN.sqrt();

  @Override
  public Z next() {
    final Z p = super.next();
    final Z q = mPrime.nextPrime(p);
    final Z r = mPrime.nextPrime(q);
    return q.square().compareTo(p.multiply(r)) > 0
      ? SQRT5.multiply(p).frac().compareTo(CR.HALF) >= 0 ? Z.ZERO : Z.ONE
      : SQRT7.multiply(p).frac().compareTo(CR.HALF) >= 0 ? Z.TWO : Z.THREE;
  }
}
