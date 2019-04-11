package irvine.oeis.a014;

import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A014221 <code>a(n+1) = 2^a(n)</code> with <code>a(-1) = 0</code>.
 * @author Sean A. Irvine
 */
public class A014221 implements Sequence {

  private Z mA = null;

  @Override
  public Z next() {
    mA = mA == null ? Z.ZERO : Z.ONE.shiftLeft(mA.intValueExact());
    return mA;
  }
}
