package irvine.oeis.a000;

import irvine.math.cr.CR;
import irvine.math.cr.ComputableReals;
import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A000503 a(n) = floor(tan(n)).
 * @author Sean A. Irvine
 */
public class A000503 implements Sequence {

  private static final ComputableReals REALS = ComputableReals.SINGLETON;
  private long mN = -1;

  @Override
  public Z next() {
    return REALS.tan(CR.valueOf(++mN)).floor(32);
  }
}
