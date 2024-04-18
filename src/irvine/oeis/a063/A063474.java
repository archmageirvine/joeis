package irvine.oeis.a063;

import irvine.math.function.Functions;
import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A063474 Half totient of 2^n+1.
 * @author Sean A. Irvine
 */
public class A063474 extends Sequence1 {

  private Z mA = Z.ONE;

  @Override
  public Z next() {
    mA = mA.multiply2();
    return Functions.PHI.z(mA.add(1)).divide2();
  }
}
