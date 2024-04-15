package irvine.oeis.a064;

import irvine.math.function.Functions;
import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A064943 Number of integers with 2*n digits that are the sum of the squares of their halves (leading zeros count; 1 does not, to avoid the ambiguity 1 = 0^2 + 1^2 = 00^2 + 01^2 = 000^2 + 001^2 = ...).
 * @author Sean A. Irvine
 */
public class A064943 extends Sequence1 {

  private Z mA = Z.ONE;

  @Override
  public Z next() {
    mA = mA.multiply(100);
    return Functions.SIGMA0.z(mA.add(1)).subtract(2);
  }
}
