package irvine.oeis.a026;

import irvine.oeis.RecordPositionSequence;

/**
 * A026144 Numbers k such that s(j) &lt; s(k) for all j &lt; k, where s = A026142.
 * @author Sean A. Irvine
 */
public class A026144 extends RecordPositionSequence {

  /** Construct the sequence. */
  public A026144() {
    super(1, new A026142(), 1);
  }
}
