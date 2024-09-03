package irvine.oeis.a072;

import irvine.math.function.Functions;
import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A072116 a(n) = (2n)!/(phi(2n)!)^2.
 * @author Sean A. Irvine
 */
public class A072116 extends Sequence1 {

  private long mN = 0;

  @Override
  public Z next() {
    mN += 2;
    return Functions.FACTORIAL.z(mN).divide(Functions.FACTORIAL.z(Functions.PHI.l(mN)).square());
  }
}
