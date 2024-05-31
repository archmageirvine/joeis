package irvine.oeis.a001;

import irvine.math.function.Functions;
import irvine.math.z.Z;
import irvine.oeis.Sequence0;

/**
 * A001821 Central factorial numbers.
 * @author Sean A. Irvine
 */
public class A001821 extends Sequence0 {

  private long mN = 3;

  @Override
  public Z next() {
    ++mN;
    return Functions.STIRLING1.z(mN, 4).square()
      .subtract(Functions.STIRLING1.z(mN, 1).multiply(Functions.STIRLING1.z(mN, 7)).multiply2())
      .add(Functions.STIRLING1.z(mN, 2).multiply(Functions.STIRLING1.z(mN, 6)).multiply2())
      .subtract(Functions.STIRLING1.z(mN, 3).multiply(Functions.STIRLING1.z(mN, 5)).multiply2());
  }
}
