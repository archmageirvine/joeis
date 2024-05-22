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
    return Functions.CARMICHAEL_LAMBDA_VARIANT.z(++mN);
  }

  @Override
  public Z a(final Z n) {
    return Functions.CARMICHAEL_LAMBDA_VARIANT.z(n);
  }

  @Override
  public Z a(final int n) {
    return Functions.CARMICHAEL_LAMBDA_VARIANT.z(n);
  }
}
