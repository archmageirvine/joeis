package irvine.oeis.a248;

import irvine.math.z.Z;
import irvine.oeis.triangle.UpperLeftTriangle;

/**
 * A248813 A(n,k) is the base-k complement of n; square array A(n,k), n&gt;=0, k&gt;=2, read by antidiagonals.
 * @author Georg Fischer
 */
public class A248813 extends UpperLeftTriangle {

  /** Construct the sequence. */
  public A248813() {
    super(0, 2, -1);
    hasRAM(true);
  }

  /**
   * Convert to some base, subtract each digit &gt; 0 from the base, and convert back.
   * @param n the number to be converted
   * @param base number base
   * @return for example in base 3: 8(10) = 22(3) -&gt; 11(3) = 4(10).
   */
  public Z negateDigits(Z n, final long base) {
    final Z b = Z.valueOf(base);
    Z shift = Z.ONE;
    Z r = Z.ZERO;
    while (!n.isZero()) {
      final Z[] qr = n.divideAndRemainder(b);
      if (!qr[1].isZero()) {
        r = r.add(qr[1].negate().add(base).multiply(shift));
      }
      shift = shift.multiply(base);
      n = qr[0];
    }
    return r;
  }

  @Override
  public Z matrixElement(final int n, final int k) {
    return negateDigits(Z.valueOf(n), k);
  }
}
