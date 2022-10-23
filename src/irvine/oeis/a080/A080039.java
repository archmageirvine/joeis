package irvine.oeis.a080;

import irvine.math.cr.CR;
import irvine.math.cr.ComputableReals;
import irvine.math.z.Z;
import irvine.oeis.Sequence0;

/**
 * A080039 a(n) = floor((1+sqrt(2))^n).
 * @author Sean A. Irvine
 */
public class A080039 extends Sequence0 {

  private static final CR N = CR.SQRT2.add(CR.ONE);
  private long mN = -1;

  @Override
  public Z next() {
    return ComputableReals.SINGLETON.pow(N, CR.valueOf(++mN)).floor();
  }
}
