package irvine.oeis.a072;

import irvine.oeis.FilterPositionSequence;
import irvine.oeis.a023.A023919;

/**
 * A072701.
 * @author Sean A. Irvine
 */
public class A072834 extends FilterPositionSequence {

  /** Construct the sequence. */
  public A072834() {
    super(0, new A023919(), NONZERO);
  }
}
