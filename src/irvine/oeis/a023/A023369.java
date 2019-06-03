package irvine.oeis.a023;

import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A023369 <code>a(n+1) = a(n)</code> converted to base 6 from base <code>3</code> (written in base <code>10)</code>.
 * @author Sean A. Irvine
 */
public class A023369 implements Sequence {

  private Z mA = null;

  @Override
  public Z next() {
    mA = mA == null ? Z.THREE : new Z(mA.toString(3), 6);
    return mA;
  }
}
