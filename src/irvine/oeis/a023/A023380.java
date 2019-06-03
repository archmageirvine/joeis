package irvine.oeis.a023;

import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A023380 <code>a(n+1) = a(n)</code> converted to base 7 from base <code>5</code> (written in base <code>10)</code>.
 * @author Sean A. Irvine
 */
public class A023380 implements Sequence {

  private Z mA = null;

  @Override
  public Z next() {
    mA = mA == null ? Z.FIVE : new Z(mA.toString(5), 7);
    return mA;
  }
}
