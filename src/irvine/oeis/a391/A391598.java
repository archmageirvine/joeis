package irvine.oeis.a391;

import irvine.math.z.Z;
import irvine.oeis.TwoParameterFormSequence;

/**
 * A391598 Primes that are perimeter^2 + hypotenuse^2 of a Pythagorean triple.
 * @author Sean A. Irvine
 */
public class A391598 extends TwoParameterFormSequence {

  /** Construct the sequence. */
  public A391598() {
    super(1, 2, 1, (x, y) -> {
      if (y >= x) {
        return null;
      }
      final Z z = Z.valueOf(x);
      final Z x2 = z.square();
      return x2.multiply2().add(z.multiply(2 * y)).square().add(x2.add(Z.valueOf(y).square()).square());
    });
  }

  @Override
  protected boolean accept(final long x, final long y, final Z n, final Z prev) {
    return n.isProbablePrime();
  }
}
