package irvine.oeis.a068;

import irvine.oeis.FilterPositionSequence;

/**
 * A068853.
 * @author Sean A. Irvine
 */
public class A068862 extends FilterPositionSequence {

  /** Construct the sequence. */
  public A068862() {
    super(1, 1, new A068861(), (k, v) -> v.longValueExact() == k);
  }
}
