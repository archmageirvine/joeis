package irvine.oeis.a080;

import irvine.math.factorial.MemoryFactorial;
import irvine.math.z.Z;
import irvine.oeis.triangle.Triangle;

/**
 * A080159 Triangular array of ways of drawing k non-intersecting chords between n points on a circle; i.e., Motzkin polynomial coefficients.
 * @author Georg Fischer
 */
public class A080159 extends Triangle {

  private static final MemoryFactorial FACTORIAL = MemoryFactorial.SINGLETON;

  /** Construct the sequence. */
  public A080159() {
    hasRAM(true);
  }

  @Override
  public Z compute(final int n, final int k) {
    return n >= 2 * k ? FACTORIAL.factorial(n).divide(FACTORIAL.factorial(n - 2 * k).multiply(FACTORIAL.factorial(k)).multiply(FACTORIAL.factorial(k + 1))) : Z.ZERO;
  }
}
