package irvine.oeis.a033;

import irvine.oeis.RecordSequence;
import irvine.oeis.a002.A002852;

/**
 * A033091 Incrementally largest terms in the continued fraction for Euler's constant gamma <code>(A002852)</code>.
 * @author Sean A. Irvine
 */
public class A033091 extends RecordSequence {

  /** Construct the sequence. */
  public A033091() {
    super(new A002852());
  }
}
