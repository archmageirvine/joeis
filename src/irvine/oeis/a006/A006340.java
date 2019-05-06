package irvine.oeis.a006;

import irvine.math.cr.CR;
import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A006340 An <code>"eta-sequence": [ (n+1)*tau + 1/2 ] - [ n*tau + 1/2 ]</code>, tau <code>= (1 + sqrt(5))/2</code>.
 * @author Sean A. Irvine
 */
public class A006340 implements Sequence {

  private long mN = -1;

  @Override
  public Z next() {
    ++mN;
    return CR.PHI.multiply(CR.valueOf(mN + 1)).round()
      .subtract(CR.PHI.multiply(CR.valueOf(mN)).round());
  }
}

