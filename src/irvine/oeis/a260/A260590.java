package irvine.oeis.a260;
// manually 2026-08-19/filter at 2026-08-19 16: 08

import irvine.oeis.FilterSequence;
import irvine.oeis.a126.A126241;

/**
 * A260590 Dropping time of 2*n+1 under the modified Collatz map (A014682).
 * @author Georg Fischer
 */
public class A260590 extends FilterSequence {

  /** Construct the sequence. */
  public A260590() {
    super(1, new A126241(), (k, v) -> (k & 1) == 1);
    next();
  }
}
