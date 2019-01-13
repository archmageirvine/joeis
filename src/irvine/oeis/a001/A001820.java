package irvine.oeis.a001;

import irvine.math.z.Stirling;
import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A001820.
 * @author Sean A. Irvine
 */
public class A001820 implements Sequence {

  private long mN = -1;

  @Override
  public Z next() {
    ++mN;
    return Stirling.firstKind(mN + 3, 3).square()
      .subtract(Stirling.firstKind(mN + 3, 2).multiply(Stirling.firstKind(mN + 3, 4)).multiply2())
      .add(Stirling.firstKind(mN + 3, 1).multiply(Stirling.firstKind(mN + 3, 5)).multiply2());
  }
}
