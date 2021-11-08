package irvine.oeis.a185;

import irvine.math.z.Binomial;
import irvine.math.z.Z;
import irvine.oeis.triangle.UpperLeftTriangle;

/**
 * A185778 Second weight array of Pascal's triangle (formatted as a rectangle), by antidiagonals.
 *
 * @author Georg Fischer
 */
public class A185778 extends UpperLeftTriangle {

  /** Construct the sequence. */
  public A185778() {
    super(1, 1, -1);
  }

  @Override
  public Z matrixElement(final int n, final int k) {
    Z result = Z.ZERO;
    switch (n) {
      case 1:
        result = Z.valueOf(k == 1 ? 1 : (k == 2 ? -1 : 0));
        break;
      case 2:
        result = Z.valueOf(k == 1 ? -1 : (k == 2 ? 2 : 0));
        break;
      case 3:
        result = Z.valueOf(k <= 3 ? 0 : 1);
        break;
      default:
        result = k <= 2 ? Z.ZERO : Binomial.binomial(n - 6 + k, k - 3);
        break;
    }
    return result;
  }
}
