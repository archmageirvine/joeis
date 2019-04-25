package irvine.oeis.a000;

import irvine.math.z.Stirling;
import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A000504 <code>S2(j,2j+3)</code> where <code>S2(n,k)</code> is a 2-associated Stirling number of the second kind.
 * @author Sean A. Irvine
 */
public class A000504 implements Sequence {

  private int mN = 0;

  @Override
  public Z next() {
    ++mN;
    return Stirling.associatedSecondKind(2, 2 * mN + 3, mN);
  }
}
