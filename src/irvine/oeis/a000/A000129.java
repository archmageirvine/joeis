package irvine.oeis.a000;

import java.io.Serializable;

import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A000129 Pell numbers: <code>a(0) = 0, a(1) = 1</code>; for <code>n &gt; 1, a(n) = 2*a(n-1) + a(n-2)</code>.
 * @author Sean A. Irvine
 */
public class A000129 implements Sequence, Serializable {

  private Z mA = Z.TWO.negate();
  private Z mB = Z.ONE;

  @Override
  public Z next() {
    final Z r = mB.multiply2().add(mA);
    mA = mB;
    mB = r;
    return r;
  }
}
