package irvine.oeis.a026;

import irvine.oeis.RecordPositionSequence;

/**
 * A026138 Numbers k such that s(j) &lt; s(k) for all j &lt; k, where s = A026136.
 * @author Sean A. Irvine
 */
public class A026138 extends RecordPositionSequence {

  /** Construct the sequence. */
  public A026138() {
    super(new A026136(), 1);
  }
}
