package irvine.oeis.a389;

import irvine.math.function.Functions;
import irvine.math.z.Z;
import irvine.oeis.TwoParameterFormSequence;

/**
 * A019654.
 * @author Sean A. Irvine
 */
public class A389663 extends TwoParameterFormSequence {

  // Numbers (x^2 + 2*x*y - y^2) * (7*x^4 + 10*x^3*y + 8*x^2*y^2 + 2*x*y^3 + y^4) where x and y are coprime with 0 < y < x and both x^2 + 2*x*y - y^2 and 7*x^4 + 10*x^3*y + 8*x^2*y^2 + 2*x*y^3 + y^4 are prime.

  /** Construct the sequence. */
  public A389663() {
    super(1, 2, 1, (x, y) -> {
      if (y >= x) {
        return null;
      }
      final Z zx = Z.valueOf(x);
      final Z zy = Z.valueOf(y);
      final Z x2 = zx.square();
      final Z y2 = zy.square();
      return x2.add(zx.multiply(2 * y)).subtract(y2).multiply(x2.square().multiply(7).add(x2.multiply(x).multiply(10 * y)).add(x2.multiply(y2).multiply(8)).add(y2.multiply(y).multiply(2 * x)).add(y2.square()));
    });
  }

  @Override
  protected boolean accept(final long x, final long y, final Z n, final Z prev) {
    if (Functions.GCD.l(x, y) != 1) {
      return false;
    }
    final Z zx = Z.valueOf(x);
    final Z zy = Z.valueOf(y);
    final Z x2 = zx.square();
    final Z y2 = zy.square();
    return x2.add(zx.multiply(2 * y)).subtract(y2).isProbablePrime()
      && x2.square().multiply(7).add(x2.multiply(x).multiply(10 * y)).add(x2.multiply(y2).multiply(8)).add(y2.multiply(y).multiply(2 * x)).add(y2.square()).isProbablePrime();
  }
}
