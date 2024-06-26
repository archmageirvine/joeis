package irvine.oeis.a087;
// Generated by gen_seq4.pl 2024-05-09/simtraf at 2024-05-09 22:36

import irvine.oeis.a025.A025586;
import irvine.oeis.transform.SimpleTransformSequence;

/**
 * A087262 Integer quotient of largest and initial values in 3x+1 iteration, started at n.
 * @author Georg Fischer
 */
public class A087262 extends SimpleTransformSequence {

  /** Construct the sequence. */
  public A087262() {
    super(1, new A025586(), (n, v) -> v.divide(n));
  }
}
