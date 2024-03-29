package irvine.oeis.a336;
// Generated by gen_seq4.pl known/simtraf at 2023-11-06 12:44

import irvine.math.z.Z;
import irvine.oeis.a122.A122111;
import irvine.oeis.transform.SimpleTransformSequence;

/**
 * A336124 a(n) = A122111(n) mod 4.
 * @author Georg Fischer
 */
public class A336124 extends SimpleTransformSequence {

  /** Construct the sequence. */
  public A336124() {
    super(1, new A122111(), v -> v.mod(Z.FOUR));
  }
}
