package irvine.oeis.a033;

import irvine.oeis.PrependSequence;
import irvine.oeis.RecordSequence;

/**
 * A033315 Incrementally largest values of minimal x satisfying Pell equation x^2 - D*y^2 = 1.
 * @author Sean A. Irvine
 */
public class A033315 extends RecordSequence {

  /** Construct the sequence. */
  public A033315() {
    super(new PrependSequence(new A033313(), 1));
  }
}

