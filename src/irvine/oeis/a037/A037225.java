package irvine.oeis.a037;

import irvine.math.function.Functions;
import irvine.math.z.Z;
import irvine.oeis.Sequence0;

/**
 * A037225 a(n) = phi(2n+1).
 * @author Sean A. Irvine
 */
public class A037225 extends Sequence0 {

  protected Z mN = Z.NEG_ONE;

  @Override
  public Z next() {
    mN = mN.add(2);
    return Functions.PHI.z(mN);
  }
}
