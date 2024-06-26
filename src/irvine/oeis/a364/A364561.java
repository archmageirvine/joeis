package irvine.oeis.a364;
// Generated by gen_seq4.pl 2024-01-18/filtpos at 2024-01-19 19:10

import irvine.oeis.FilterPositionSequence;
import irvine.oeis.a156.A156552;

/**
 * A364561 Odd numbers k for which A156552(k) &lt; k.
 * @author Georg Fischer
 */
public class A364561 extends FilterPositionSequence {

  /** Construct the sequence. */
  public A364561() {
    super(1, 1, new A156552(), (k, v) -> (k & 1) == 1 && v.compareTo(k) < 0);
  }
}
