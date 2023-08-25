package irvine.oeis.a065;

import irvine.oeis.InverseSequence;

/**
 * A065284 A065282 conjugated with A059893, inverse of A065283.
 * @author Sean A. Irvine
 */
public class A065284 extends InverseSequence {

  /** Construct the sequence. */
  public A065284() {
    super(1, new A065283(), 1);
  }
}
