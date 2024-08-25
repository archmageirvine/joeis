package irvine.oeis.a072;

import irvine.math.function.Functions;
import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A071115.
 * @author Sean A. Irvine
 */
public class A072001 extends Sequence1 {

  private long mN = -1;

  @Override
  public Z next() {
    return Functions.FACTORIAL_BASE.z(++mN).multiply(10).add(1);
  }
}
