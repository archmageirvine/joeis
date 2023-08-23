package irvine.oeis.a065;

import irvine.oeis.InverseSequence;

/**
 * A065254 "Inverse" to A065253.
 * @author Sean A. Irvine
 */
public class A065254 extends InverseSequence {

  /** Construct the sequence. */
  public A065254() {
    super(1, new A065253(), 1);
  }
}
