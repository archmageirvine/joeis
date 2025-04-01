package irvine.oeis.a076;

import irvine.oeis.FilterPositionSequence;

/**
 * A076351 Numbers n such that A076341(n)=0.
 * @author Sean A. Irvine
 */
public class A076351 extends FilterPositionSequence {

  /** Construct the sequence. */
  public A076351() {
    super(1, new A076341(), ZERO);
  }
}
