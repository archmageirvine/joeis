package irvine.oeis.a323;

import irvine.factor.factor.Jaguar;
import irvine.math.z.Z;
import irvine.oeis.a184.A184271;

/**
 * A323859 Number of binary toroidal necklaces of size n.
 * @author Gregory Morse
 */
public class A323859 extends A184271 {
  private int mN = -1;

  /** Construct the sequence. */
  public A323859() {
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
      sum = sum.add(matrixElement(k, mN / k));
    }
    return sum;
  }
}
