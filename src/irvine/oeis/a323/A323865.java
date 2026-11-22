package irvine.oeis.a323;

import irvine.factor.factor.Jaguar;
import irvine.math.z.Z;

/**
 * A323865 Number of aperiodic binary toroidal necklaces of size n.
 * @author Gregory Morse
 */
public class A323865 extends A323861 {
  private int mN = -1;

  /** Construct the sequence. */
  public A323865() {
    setOffset(0);
  }

  @Override
  public Z next() {
    if (++mN == 0) {
      return Z.ONE;
    }
    Z sum = Z.ZERO;
    for (final Z d : Jaguar.factor(mN).divisors()) {
      final int k = d.intValueExact();
      sum = sum.add(aperiodic(k, mN / k));
    }
    return sum;
  }
}
