package irvine.oeis.a011;

import irvine.math.function.Functions;
import irvine.math.z.Z;
import irvine.oeis.DirectSequence;
import irvine.oeis.Sequence1;

/**
 * A011773 Variant of Carmichael's lambda function: a(p1^e1*...*pN^eN) = lcm((p1-1)*p1^(e1-1), ..., (pN-1)*pN^(eN-1)).
 * @author Sean A. Irvine
 */
public class A011773 extends Sequence1 implements DirectSequence {

  private long mN = 0;

  @Override
  public Z next() {
    mN += 2;
    return mN == 4 ? Z.ONE : Functions.CARMICHAEL_LAMBDA.z(mN);
  }

  @Override
  public Z a(final Z n) {
    return n.equals(Z.TWO) ? Z.ONE : Functions.CARMICHAEL_LAMBDA.z(n.multiply2());
  }

  @Override
  public Z a(final int n) {
    return n == 2 ? Z.ONE : Functions.CARMICHAEL_LAMBDA.z(n * 2);
  }

}
