package irvine.oeis.a000;

import irvine.math.cr.CR;
import irvine.math.cr.ComputableReals;
import irvine.math.z.Z;
import irvine.oeis.Sequence0;

/**
 * A000503 a(n) = floor(tan(n)).
 * @author Sean A. Irvine
 */
public class A000503 extends Sequence0 {

  private static final ComputableReals REALS = ComputableReals.SINGLETON;
  private long mN = -1;

  @Override
  public Z next() {
    return REALS.tan(CR.valueOf(++mN)).floor();
  }
}
