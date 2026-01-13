package irvine.oeis.a083;

import irvine.oeis.FixedPointPositionSequence;

/**
 * A083166 Index of terms in A083164 which are not dislocated in the rearrangement. Or k such that A083164(k) = k.
 * @author Sean A. Irvine
 */
public class A083166 extends FixedPointPositionSequence {

  /** Construct the sequence. */
  public A083166() {
    super(1, new A083164());
  }
}

