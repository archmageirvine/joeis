package irvine.oeis.a033;

import irvine.oeis.RecordSequence;
import irvine.oeis.a001.A001203;

/**
 * A033089 Incrementally largest terms in the continued fraction for Pi.
 * @author Sean A. Irvine
 */
public class A033089 extends RecordSequence {

  /** Construct the sequence. */
  public A033089() {
    super(new A001203());
  }
}
