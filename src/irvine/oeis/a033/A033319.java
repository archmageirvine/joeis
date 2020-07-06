package irvine.oeis.a033;

import irvine.oeis.PrependSequence;
import irvine.oeis.RecordSequence;

/**
 * A033319 Incrementally largest values of minimal y satisfying Pell equation <code>x^2-Dy^2=1</code>.
 * @author Sean A. Irvine
 */
public class A033319 extends RecordSequence {

  /** Construct the sequence. */
  public A033319() {
    super(new PrependSequence(new A033317(), 0));
  }
}

