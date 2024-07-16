package irvine.oeis.a071;

import irvine.oeis.RecordPositionSequence;
import irvine.oeis.a058.A058250;

/**
 * A071349 Numbers k for which the GCD of the k-th primorial number and its totient (A058250) sets record.
 * @author Sean A. Irvine
 */
public class A071349 extends RecordPositionSequence {

  /** Construct the sequence. */
  public A071349() {
    super(1, new A058250().skip(), 1);
  }
}
