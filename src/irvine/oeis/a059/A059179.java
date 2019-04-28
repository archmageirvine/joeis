package irvine.oeis.a059;

import irvine.math.cr.CR;
import irvine.math.cr.ComputableReals;
import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A059179 Engel expansion of <code>3^(1/3) = 1.44225</code>.
 * @author Sean A. Irvine
 */
public class A059179 implements Sequence {

  private CR mA = ComputableReals.SINGLETON.pow(CR.THREE, CR.THREE.inverse());

  @Override
  public Z next() {
    final Z a = mA.inverse().ceil(32);
    mA = mA.multiply(CR.valueOf(a)).subtract(CR.ONE);
    return a;
  }
}
