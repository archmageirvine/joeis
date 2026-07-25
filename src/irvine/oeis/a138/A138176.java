package irvine.oeis.a138;
// manually 2026-07-25/hanktraf at 2026-07-25 09:35

import irvine.oeis.FilterSequence;
import irvine.oeis.transform.HankelTransformSequence;

/**
 * A138176 Hankel transform of A138175.
 * @author Georg Fischer
 */
public class A138176 extends FilterSequence {

  /** Construct the sequence. */
  public A138176() {
    super(0, new HankelTransformSequence(0, new A138175(), 1), (k, v) -> (k & 1) == 0);
  }
}
