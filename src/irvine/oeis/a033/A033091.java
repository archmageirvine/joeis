package irvine.oeis.a033;

import irvine.oeis.RecordSequence;
import irvine.oeis.a002.A002852;

/**
 * A033091 Incrementally largest terms in the continued fraction for Euler's constant gamma (A002852).
 * @author Sean A. Irvine
 */
public class A033091 extends RecordSequence {

  /** Construct the sequence. */
  public A033091() {
    super(0, new A002852());
  }
}
