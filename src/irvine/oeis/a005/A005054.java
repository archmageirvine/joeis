package irvine.oeis.a005;

import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A005054 <code>a(n) = (4*5^n + 0^n) / 5</code>.
 * @author Sean A. Irvine
 */
public class A005054 implements Sequence {

  private Z mA = null;

  @Override
  public Z next() {
    mA = mA == null ? Z.ONE : mA.multiply(mA.equals(Z.ONE) ? 4 : 5);
    return mA;
  }
}

