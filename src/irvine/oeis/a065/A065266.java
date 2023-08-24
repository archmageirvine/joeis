package irvine.oeis.a065;

import irvine.oeis.InverseSequence;

/**
 * A065266 A065264 conjugated with A059893, inverse of A065265.
 * @author Sean A. Irvine
 */
public class A065266 extends InverseSequence {

  /** Construct the sequence. */
  public A065266() {
    super(1, new A065265(), 1);
  }
}
