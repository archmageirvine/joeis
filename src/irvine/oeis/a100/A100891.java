package irvine.oeis.a100;
// manually 2026-03-06/filter at 2026-03-06 11:20

import irvine.oeis.FilterSequence;
import irvine.oeis.a000.A000931;

/**
 * A100891 Prime Padovan numbers.
 * @author Georg Fischer
 */
public class A100891 extends FilterSequence {

  /** Construct the sequence. */
  public A100891() {
    super(1, new A000931().skip(1), PRIME);
    next();
  }
}
