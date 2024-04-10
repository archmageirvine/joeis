package irvine.oeis.a000;

import irvine.math.z.Z;
import irvine.oeis.DirectSequence;
import irvine.oeis.Sequence0;

/**
 * A000792 a(n) = max{(n - i)*a(i) : i &lt; n}; a(0) = 1.
 * @author Sean A. Irvine
 */
public class A000792 extends Sequence0 implements DirectSequence {

  private int mN = -1;

  @Override
  public Z a(final Z n) {
    return a(n.intValueExact());
  }

  @Override
  public Z a(final int m) {
    final int n = m / 3;
    switch (m % 3) {
      case 0:
        return Z.THREE.pow(n);
      case 1:
        return m == 1 ? Z.ONE : Z.THREE.pow(n - 1).shiftLeft(2);
      default:
        return Z.THREE.pow(n).multiply2();
    }
  }

  @Override
  public Z next() {
    return a(++mN);
  }
}
