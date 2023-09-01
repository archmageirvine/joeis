package irvine.oeis.a065;

import irvine.oeis.RecordPositionSequence;
import irvine.oeis.a051.A051953;

/**
 * A065385 Numbers m at which value of cototient function (A051953) reaches a new record: cototient(m) &gt; cototient(k) for all k &lt; m.
 * @author Sean A. Irvine
 */
public class A065385 extends RecordPositionSequence {

  /** Construct the sequence. */
  public A065385() {
    super(new A051953(), 1);
  }
}
