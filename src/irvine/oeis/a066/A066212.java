package irvine.oeis.a066;

import irvine.math.cr.CR;
import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A066207.
 * @author Sean A. Irvine
 */
public class A066212 extends Sequence1 {

  private long mN = 0;

  @Override
  public Z next() {
    return CR.PHI.subtract(CR.valueOf(CR.PHI.multiply(++mN).round()).divide(mN)).inverse().round();
  }
}
