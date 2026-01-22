package irvine.oeis.a083;

import irvine.oeis.FixedPointPositionSequence;

/**
 * A083166 Fixed points of A083164: numbers k such that A083164(k) = k.
 * @author Sean A. Irvine
 */
public class A083166 extends FixedPointPositionSequence {

  /** Construct the sequence. */
  public A083166() {
    super(1, new A083164());
  }
}

