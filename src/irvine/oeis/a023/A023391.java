package irvine.oeis.a023;

import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A023391 <code>a(n+1) = a(n)</code> converted to base 9 from base <code>8</code> (written in base <code>10)</code>.
 * @author Sean A. Irvine
 */
public class A023391 implements Sequence {

  private Z mA = null;

  @Override
  public Z next() {
    mA = mA == null ? Z.EIGHT : new Z(mA.toString(8), 9);
    return mA;
  }
}
