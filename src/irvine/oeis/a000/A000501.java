package irvine.oeis.a000;

import irvine.math.cr.CR;
import irvine.math.cr.ComputableReals;
import irvine.math.z.Z;
import irvine.oeis.Sequence0;

/**
 * A000501 a(n) = floor(cosh(n)).
 * @author Sean A. Irvine
 */
public class A000501 extends Sequence0 {

  private static final ComputableReals REALS = ComputableReals.SINGLETON;
  private long mN = -1;

  @Override
  public Z next() {
    return REALS.cosh(CR.valueOf(++mN)).floor();
  }
}
