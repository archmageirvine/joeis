package irvine.oeis.a075;

import irvine.oeis.FilterPositionSequence;

/**
 * A075449 Numbers k such that A075443(k) == 0 (mod A000010(k)).
 * @author Sean A. Irvine
 */
public class A075449 extends FilterPositionSequence {

  /** Construct the sequence. */
  public A075449() {
    super(1, new A075444(), ZERO);
  }
}
