package irvine.oeis.a006;

import irvine.math.cr.CR;
import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A006340 An "eta-sequence": [ (n+1)*tau + 1/2 ] - [ n*tau + 1/2 ], tau = (1 + sqrt(5))/2.
 * @author Sean A. Irvine
 */
public class A006340 implements Sequence {

  private long mN = -1;

  @Override
  public Z next() {
    ++mN;
    return CR.PHI.multiply(mN + 1).round()
      .subtract(CR.PHI.multiply(mN).round());
  }
}

