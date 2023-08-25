package irvine.oeis.a065;

import irvine.oeis.InverseSequence;

/**
 * A065278 A065276 conjugated with A059893, inverse of A065277.
 * @author Sean A. Irvine
 */
public class A065278 extends InverseSequence {

  /** Construct the sequence. */
  public A065278() {
    super(1, new A065277(), 1);
  }
}
