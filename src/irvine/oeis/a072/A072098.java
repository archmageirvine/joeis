package irvine.oeis.a072;

import irvine.oeis.RecordPositionSequence;
import irvine.oeis.a033.A033873;

/**
 * A072098 Numbers k such that the difference between 10^k and the next prime &gt; 10^k is a record high.
 * @author Sean A. Irvine
 */
public class A072098 extends RecordPositionSequence {

  /** Construct the sequence. */
  public A072098() {
    super(1, new A033873().skip(), 1);
  }
}
