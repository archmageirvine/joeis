package irvine.oeis.a000;

import irvine.math.z.Stirling;
import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A000497 S2(j,2j+2) where S2(n,k) is a 2-associated Stirling number of the second kind.
 * @author Sean A. Irvine
 */
public class A000497 implements Sequence {

  private int mN = 0;

  @Override
  public Z next() {
    ++mN;
    return Stirling.associatedSecondKind(2, 2 * mN + 2, mN);
  }
}
