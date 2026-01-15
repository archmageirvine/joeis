package irvine.oeis.a083;

import irvine.oeis.FixedPointPositionSequence;

/**
 * A083180 Numbers which retain their natural position under the rearrangement of A083179.
 * @author Sean A. Irvine
 */
public class A083180 extends FixedPointPositionSequence {

  /** Construct the sequence. */
  public A083180() {
    super(1, new A083179());
  }
}

