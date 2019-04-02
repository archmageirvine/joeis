package irvine.oeis.a005;

import irvine.math.z.Binomial;
import irvine.math.z.Z;
import irvine.oeis.Sequence;
import irvine.oeis.a000.A000110;

/**
 * A005494 3-Bell numbers: E.g.f.: exp(3*z + exp(z) - 1).
 * @author Sean A. Irvine
 */
public class A005494 implements Sequence {

  private int mN = -1;

  @Override
  public Z next() {
    ++mN;
    final A000110 bell = new A000110();
    Z sum = Z.ZERO;
    Z three = Z.THREE.pow(mN);
    for (int k = 0; k <= mN; ++k, three = three.divide(3)) {
      sum = sum.add(three.multiply(bell.next()).multiply(Binomial.binomial(mN, k)));
    }
    return sum;
  }
}

