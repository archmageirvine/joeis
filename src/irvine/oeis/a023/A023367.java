package irvine.oeis.a023;

import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A023367 <code>a(n+1) = a(n)</code> converted to base 4 from base <code>3</code> (written in base <code>10)</code>.
 * @author Sean A. Irvine
 */
public class A023367 implements Sequence {

  private Z mA = null;

  @Override
  public Z next() {
    mA = mA == null ? Z.THREE : new Z(mA.toString(3), 4);
    return mA;
  }
}
