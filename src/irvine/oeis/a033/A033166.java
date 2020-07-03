package irvine.oeis.a033;

import irvine.oeis.RecordSequence;
import irvine.oeis.a013.A013631;

/**
 * A033166 Incrementally largest terms in the continued fraction for <code>zeta(3)</code>.
 * @author Sean A. Irvine
 */
public class A033166 extends RecordSequence {

  /** Construct the sequence. */
  public A033166() {
    super(new A013631());
  }
}
