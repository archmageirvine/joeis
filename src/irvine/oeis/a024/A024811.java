package irvine.oeis.a024;

import irvine.math.cr.CR;
import irvine.math.cr.ComputableReals;
import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A024811 a(n) = [ tan(m*pi/2) ], where m = 1 - 1/n.
 * @author Sean A. Irvine
 */
public class A024811 implements Sequence {

  private long mN = 0;

  @Override
  public Z next() {
    return ComputableReals.SINGLETON.tan(CR.ONE.subtract(CR.valueOf(++mN).inverse()).multiply(CR.HALF_PI)).floor();
  }
}
