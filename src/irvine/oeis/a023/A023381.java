package irvine.oeis.a023;

import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A023381 <code>a(n+1) = a(n)</code> converted to base 8 from base <code>5</code> (written in base <code>10)</code>.
 * @author Sean A. Irvine
 */
public class A023381 implements Sequence {

  private Z mA = null;

  @Override
  public Z next() {
    mA = mA == null ? Z.FIVE : new Z(mA.toString(5), 8);
    return mA;
  }
}
