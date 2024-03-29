package irvine.oeis.a002;

import irvine.math.cr.CR;
import irvine.math.cr.ComputableReals;
import irvine.math.z.Z;
import irvine.oeis.Sequence0;

/**
 * A002459 Nearest integer to cosh(n).
 * @author Sean A. Irvine
 */
public class A002459 extends Sequence0 {

  private long mN = -1;

  @Override
  public Z next() {
    return ComputableReals.SINGLETON.cosh(CR.valueOf(++mN)).round();
  }
}
