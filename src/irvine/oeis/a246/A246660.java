package irvine.oeis.a246;
// Generated by gen_seq4.pl manch4/rultraf at 2024-03-12 13:36

import irvine.oeis.a000.A000142;
import irvine.oeis.transform.RunLengthTransformSequence;

/**
 * A246660 Run Length Transform of factorials.
 * @author Georg Fischer
 */
public class A246660 extends RunLengthTransformSequence {

  /** Construct the sequence. */
  public A246660() {
    super(0, new A000142());
  }
}
