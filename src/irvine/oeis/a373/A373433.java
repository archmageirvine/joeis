package irvine.oeis.a373;
// Generated by gen_seq4.pl 2024-06-13/simtraf at 2024-06-14 00:04

import irvine.math.function.Functions;
import irvine.oeis.a000.A000111;
import irvine.oeis.transform.SimpleTransformSequence;

/**
 * A373433 a(n) = A000111(n) * A000142(n). Row sums of A373434.
 * @author Georg Fischer
 */
public class A373433 extends SimpleTransformSequence {

  /** Construct the sequence. */
  public A373433() {
    super(0, new A000111(), (n, v) -> v.multiply(Functions.FACTORIAL.z(n)));
  }
}
