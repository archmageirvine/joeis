package irvine.oeis.a000;

import irvine.math.cr.CR;
import irvine.math.cr.ComputableReals;
import irvine.math.z.Z;
import irvine.oeis.Sequence0;

/**
 * A000471 a(n) = floor(sinh(n)).
 * @author Sean A. Irvine
 */
public class A000471 extends Sequence0 {

  private static final ComputableReals FLD = ComputableReals.SINGLETON;
  private long mN = -1;

  @Override
  public Z next() {
    return FLD.sinh(CR.valueOf(++mN)).floor();
  }
}
