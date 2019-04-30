package irvine.oeis.a059;

import irvine.math.cr.CR;
import irvine.math.z.Z;
import irvine.oeis.Sequence;
import irvine.oeis.a073.A073005;

/**
 * A059188 Engel expansion of <code>Gamma(1/3) = 2.67894</code>.
 * @author Sean A. Irvine
 */
public class A059188 implements Sequence {

  private CR mA = A073005.GAMMA_THIRD;

  @Override
  public Z next() {
    final Z a = mA.inverse().ceil(32);
    mA = mA.multiply(CR.valueOf(a)).subtract(CR.ONE);
    return a;
  }
}
