package irvine.oeis.a065;

import irvine.oeis.InverseSequence;

/**
 * A065272 A065270 conjugated with A059893, inverse of A065271.
 * @author Sean A. Irvine
 */
public class A065272 extends InverseSequence {

  /** Construct the sequence. */
  public A065272() {
    super(1, new A065271(), 1);
  }
}
