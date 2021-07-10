package irvine.oeis.a026;

import irvine.oeis.RecordPositionSequence;

/**
 * A026179 Numbers k such that A026177(j) &lt; A026177(k) for all j &lt; k.
 * @author Sean A. Irvine
 */
public class A026179 extends RecordPositionSequence {

  /** Construct the sequence. */
  public A026179() {
    super(new A026177(), 1);
  }
}
