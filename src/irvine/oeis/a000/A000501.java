package irvine.oeis.a000;

import irvine.math.cr.CR;
import irvine.math.cr.ComputableReals;
import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A000501 a(n) = floor(cosh(n)).
 * @author Sean A. Irvine
 */
public class A000501 implements Sequence {

  private static final ComputableReals REALS = ComputableReals.SINGLETON;
  private long mN = -1;

  @Override
  public Z next() {
    return REALS.cosh(CR.valueOf(++mN)).floor(32);
  }
}
