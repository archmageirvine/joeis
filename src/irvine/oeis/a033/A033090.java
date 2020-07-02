package irvine.oeis.a033;

import irvine.oeis.RecordPositionSequence;
import irvine.oeis.a001.A001203;

/**
 * A033090 Indices of incrementally largest terms in the continued fraction for <code>Pi</code>.
 * @author Sean A. Irvine
 */
public class A033090 extends RecordPositionSequence {

  /** Construct the sequence. */
  public A033090() {
    super(new A001203(), 1);
  }
}
