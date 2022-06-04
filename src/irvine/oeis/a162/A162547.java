package irvine.oeis.a162;

import irvine.math.z.Z;
import irvine.oeis.recur.ConstantOrderRecurrence;

/**
 * A162547 Somos-4 variant: if n!=4k+1, then a(n) = (4*a(n-1)*a(n-3) - 4*a(n-2)^2) / a(n-4), otherwise a(n) = 0, with a(-2) = a(-1) = a(0) = 1.
 * @author Georg Fischer
 */
public class A162547 extends ConstantOrderRecurrence {

  /** Construct the sequence. */
  public A162547() {
    super(0, 4, 0, 1, 0, -4, -16);
  }

  @Override
  protected Z compute(final int n) {
    return n % 4 != 1 ? a(n - 1).multiply(a(n - 3)).subtract(a(n - 2).square()).multiply(4).divide(a(n - 4)) : Z.ZERO;
  }
}
