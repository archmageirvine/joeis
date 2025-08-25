package irvine.oeis.a387;

import irvine.math.function.Functions;
import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A387107 a(n) = psi(2^n-1), where psi = A002322.
 * @author Sean A. Irvine
 */
public class A387107 extends Sequence1 {

  private long mN = 0;

  @Override
  public Z next() {
    return Functions.CARMICHAEL_LAMBDA.z(Z.ONE.shiftLeft(++mN).subtract(1));
  }
}
