package irvine.oeis.a080;

import irvine.math.function.Functions;
import irvine.math.z.Z;
import irvine.oeis.triangle.Triangle;

/**
 * A080159 Triangular array of ways of drawing k non-intersecting chords between n points on a circle; i.e., Motzkin polynomial coefficients.
 * @author Georg Fischer
 */
public class A080159 extends Triangle {


  /** Construct the sequence. */
  public A080159() {
    hasRAM(true);
  }

  @Override
  public Z compute(final int n, final int k) {
    return n >= 2 * k ? Functions.FACTORIAL.z(n).divide(Functions.FACTORIAL.z(n - 2 * k).multiply(Functions.FACTORIAL.z(k)).multiply(Functions.FACTORIAL.z(k + 1))) : Z.ZERO;
  }
}
