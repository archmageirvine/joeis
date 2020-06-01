package irvine.oeis.a004;

import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A004019 <code>a(0) = 0;</code> for <code>n &gt; 0, a(n) = (a(n-1) + 1)^2</code>.
 * @author Sean A. Irvine
 */
public class A004019 implements Sequence {

  private Z mA = null;

  @Override
  public Z next() {
    mA = mA == null ? Z.ZERO : mA.add(1).square();
    return mA;
  }
}
