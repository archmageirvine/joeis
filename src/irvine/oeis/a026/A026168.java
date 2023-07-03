package irvine.oeis.a026;

import irvine.oeis.RecordPositionSequence;

/**
 * A026168 Numbers k such that A026166(j) &lt; A026166(k) for all j &lt; k.
 * @author Sean A. Irvine
 */
public class A026168 extends RecordPositionSequence {

  /** Construct the sequence. */
  public A026168() {
    super(1, new A026166(), 1);
  }
}
