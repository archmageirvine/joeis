package irvine.oeis.a100;
// Generated by gen_seq4.pl 2024-04-11/simtraf at 2024-04-11 21:12

import irvine.oeis.a069.A069104;
import irvine.oeis.transform.SimpleTransformSequence;

/**
 * A100993 Indices k of Fibonacci numbers F(k) (A000045) that are divisible by k-1.
 * @author Georg Fischer
 */
public class A100993 extends SimpleTransformSequence {

  /** Construct the sequence. */
  public A100993() {
    super(1, new A069104(), v -> v.add(1));
  }
}
