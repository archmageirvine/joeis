package irvine.oeis.a004;

import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A004168 <code>a(n+1) = a(n)*(a(n)+1)</code>.
 * @author Sean A. Irvine
 */
public class A004168 implements Sequence {

  private Z mA = null;

  @Override
  public Z next() {
    mA = mA == null ? Z.THREE : mA.multiply(mA.add(1));
    return mA;
  }
}
