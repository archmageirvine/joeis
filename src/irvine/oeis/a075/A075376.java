package irvine.oeis.a075;

import irvine.oeis.FixedPointPositionSequence;

/**
 * A075376 Terms of A075375 for which a(k) = k, i.e., with dislocation 0.
 * @author Sean A. Irvine
 */
public class A075376 extends FixedPointPositionSequence {

  /** Construct the sequence. */
  public A075376() {
    super(new A075375());
  }
}
