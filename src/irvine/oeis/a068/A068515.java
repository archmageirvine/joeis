package irvine.oeis.a068;

import irvine.math.cr.CR;
import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A068515 A measure of how close the square root of 2 is to rational numbers.
 * @author Sean A. Irvine
 */
public class A068515 extends Sequence1 {

  private long mN = 0;

  @Override
  public Z next() {
    ++mN;
    return CR.SQRT2.subtract(CR.valueOf(CR.SQRT2.multiply(mN).round()).divide(mN)).inverse().round();
  }
}

