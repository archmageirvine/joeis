package irvine.oeis.a001;

import irvine.math.z.Stirling;
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
    return Stirling.firstKind(mN, 4).square()
      .subtract(Stirling.firstKind(mN, 1).multiply(Stirling.firstKind(mN, 7)).multiply2())
      .add(Stirling.firstKind(mN, 2).multiply(Stirling.firstKind(mN, 6)).multiply2())
      .subtract(Stirling.firstKind(mN, 3).multiply(Stirling.firstKind(mN, 5)).multiply2());
  }
}
