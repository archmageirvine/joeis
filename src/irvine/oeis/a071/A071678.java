package irvine.oeis.a071;

import irvine.math.function.Functions;
import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A071678 GCD of n! and the reverse of n!.
 * @author Sean A. Irvine
 */
public class A071678 extends Sequence1 {

  private long mN = 0;
  private Z mF = Z.ONE;

  @Override
  public Z next() {
    mF = mF.multiply(++mN);
    return Functions.GCD.z(mF, Functions.REVERSE.z(mF));
  }
}
