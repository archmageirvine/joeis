package irvine.oeis.a065;

import irvine.oeis.RecordPositionSequence;
import irvine.oeis.a062.A062401;

/**
 * A065391 Numbers m such that A062401(m) = phi(sigma(m)) is increasing to a record value, i.e., A062401(m) represents a new peak, so that A062401(m) &gt; A062401(k) for all k &lt; m.
 * @author Sean A. Irvine
 */
public class A065391 extends RecordPositionSequence {

  /** Construct the sequence. */
  public A065391() {
    super(new A062401(), 1);
  }
}
