package irvine.oeis.a065;

import irvine.oeis.InverseSequence;

/**
 * A065290 A065288 conjugated with A059893, inverse of A065289.
 * @author Sean A. Irvine
 */
public class A065290 extends InverseSequence {

  /** Construct the sequence. */
  public A065290() {
    super(1, new A065289(), 1);
  }
}
