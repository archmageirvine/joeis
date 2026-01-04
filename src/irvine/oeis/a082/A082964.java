package irvine.oeis.a082;

import irvine.math.cr.CR;
import irvine.math.z.Z;
import irvine.oeis.Sequence0;

/**
 * A082964 a(n) = round(n/Pi), n divided by Pi rounded to the nearest integer.
 * @author Sean A. Irvine
 */
public class A082964 extends Sequence0 {

  private long mN = -1;

  @Override
  public Z next() {
    return CR.valueOf(++mN).divide(CR.PI).round();
  }
}
