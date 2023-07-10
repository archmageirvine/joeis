package irvine.oeis.a064;

import irvine.oeis.FixedPointPositionSequence;

/**
 * A064420 Numbers n such that A064413(n+1) = n. Probably complete.
 * @author Sean A. Irvine
 */
public class A064420 extends FixedPointPositionSequence {

  /** Construct the sequence. */
  public A064420() {
    super(1, new A064413().skip());
  }
}
