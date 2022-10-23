package irvine.oeis.a022;

import irvine.math.cr.CR;
import irvine.math.z.Z;
import irvine.oeis.Sequence0;

/**
 * A022846 Nearest integer to n*sqrt(2).
 * @author Sean A. Irvine
 */
public class A022846 extends Sequence0 {

  private long mN = -1;

  @Override
  public Z next() {
    return CR.SQRT2.multiply(++mN).round();
  }
}
