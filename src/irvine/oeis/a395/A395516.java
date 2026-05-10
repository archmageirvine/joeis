package irvine.oeis.a395;

import irvine.math.function.Functions;
import irvine.math.z.Z;
import irvine.oeis.FilterNumberSequence;

/**
 * A395516 Numbers k such that A008472(k) and A001414(k) share the same squarefree kernel but neither divides the other.
 * @author Sean A. Irvine
 */
public class A395516 extends FilterNumberSequence {

  /** Construct the sequence. */
  public A395516() {
    super(1, 336, k -> {
      final Z sopf = Functions.SOPF.z(k);
      final Z sopfr = Functions.SOPFR.z(k);
      return !sopfr.mod(sopf).isZero() && Functions.SQUARE_FREE_KERNEL.z(sopf).equals(Functions.SQUARE_FREE_KERNEL.z(sopfr));
    });
  }
}
