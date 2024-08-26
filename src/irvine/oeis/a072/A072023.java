package irvine.oeis.a072;

import irvine.oeis.FilterPositionSequence;

/**
 * A072023 Values of k such that A072022(k)=0.
 * @author Sean A. Irvine
 */
public class A072023 extends FilterPositionSequence {

  /** Construct the sequence. */
  public A072023() {
    super(1, new A072022(), ZERO);
  }
}
