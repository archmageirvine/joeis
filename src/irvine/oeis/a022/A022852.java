package irvine.oeis.a022;

import irvine.math.cr.CR;
import irvine.math.z.Z;
import irvine.oeis.Sequence0;

/**
 * A022852 Integer nearest n * e, where e is the natural log base.
 * @author Sean A. Irvine
 */
public class A022852 extends Sequence0 {

  private long mN = -1;

  @Override
  public Z next() {
    return CR.E.multiply(++mN).round();
  }
}
