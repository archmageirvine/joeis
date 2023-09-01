package irvine.oeis.a065;

import irvine.oeis.RecordPositionSequence;
import irvine.oeis.a062.A062401;

/**
 * A065391 Numbers n such that A062401(n) = phi(sigma(n)) is increasing; i.e., A062401(n) represents a new peak, so that A062401(n) &gt; A062401(k) for all k &lt; n.
 * @author Sean A. Irvine
 */
public class A065391 extends RecordPositionSequence {

  /** Construct the sequence. */
  public A065391() {
    super(new A062401(), 1);
  }
}
