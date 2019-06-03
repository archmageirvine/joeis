package irvine.oeis.a023;

import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A023390 <code>a(n+1) = a(n)</code> written in base <code>7</code> (read in base <code>10); a(1) = 7</code>.
 * @author Sean A. Irvine
 */
public class A023390 implements Sequence {

  private Z mA = null;

  @Override
  public Z next() {
    mA = mA == null ? Z.SEVEN : new Z(mA.toString(7));
    return mA;
  }
}
