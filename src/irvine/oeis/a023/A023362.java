package irvine.oeis.a023;

import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A023362 <code>a(n+1) = a(n)</code> converted to base 5 from base <code>2</code> (written in base <code>10)</code>.
 * @author Sean A. Irvine
 */
public class A023362 implements Sequence {

  private Z mA = null;

  @Override
  public Z next() {
    mA = mA == null ? Z.TWO : new Z(mA.toString(2), 5);
    return mA;
  }
}
