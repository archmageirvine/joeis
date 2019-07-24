package irvine.oeis.a024;

import irvine.math.cr.CR;
import irvine.math.cr.ComputableReals;
import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A024810 <code>a(n) = floor( tan(m*Pi/2) )</code>, where m <code>= 1 - 2^(-n)</code>.
 * @author Sean A. Irvine
 */
public class A024810 implements Sequence {

  private Z mT = Z.ONE;

  @Override
  public Z next() {
    mT = mT.multiply2();
    return ComputableReals.SINGLETON.tan(CR.ONE.subtract(CR.valueOf(mT).inverse()).multiply(CR.HALF_PI)).floor();
  }
}
