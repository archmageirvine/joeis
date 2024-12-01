package irvine.oeis.a073;

import irvine.math.cr.CR;
import irvine.math.cr.ComputableReals;
import irvine.math.z.Z;
import irvine.oeis.a000.A000040;

/**
 * A073500.
 * @author Sean A. Irvine
 */
public class A073518 extends A000040 {

  @Override
  public Z next() {
    final Z p = super.next();
    return Z.TWO.equals(p) ? Z.ZERO : ComputableReals.SINGLETON.cot(CR.PI.divide(p)).round();
  }
}

