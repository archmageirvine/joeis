package irvine.oeis.a253;
// Generated by gen_seq4.pl rultraf at 2024-01-19 09:13

import irvine.oeis.a087.A087206;
import irvine.oeis.transform.RunLengthTransformSequence;

/**
 * A253064 Number of odd terms in f^n, where f = 1/x + 1 + x + y.
 * @author Georg Fischer
 */
public class A253064 extends RunLengthTransformSequence {

  /** Construct the sequence. */
  public A253064() {
    super(0, new A087206());
  }
}
