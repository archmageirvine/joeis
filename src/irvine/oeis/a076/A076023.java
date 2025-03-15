package irvine.oeis.a076;

import irvine.oeis.FixedPointPositionSequence;

/**
 * A076023 Numbers n such that A076022(n)=n.
 * @author Sean A. Irvine
 */
public class A076023 extends FixedPointPositionSequence {

  /** Construct the sequence. */
  public A076023() {
    super(new A076022());
  }
}
