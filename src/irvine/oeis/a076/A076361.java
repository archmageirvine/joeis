package irvine.oeis.a076;

import irvine.oeis.FilterPositionSequence;

/**
 * A076361 Numbers k such that d(sigma(k)) = sigma(d(k)).
 * @author Sean A. Irvine
 */
public class A076361 extends FilterPositionSequence {

  /** Construct the sequence. */
  public A076361() {
    super(1, new A076360(), ZERO);
  }
}
