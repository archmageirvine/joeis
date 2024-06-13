package irvine.oeis.a070;

import irvine.oeis.RecordPositionSequence;

/**
 * A070743 n sets a new record for the index of the (presumably) last palindrome in the 'Reverse and Add' trajectory of n.
 * @author Sean A. Irvine
 */
public class A070743 extends RecordPositionSequence {

  /** Construct the sequence. */
  public A070743() {
    super(1, new A070742(), 1);
  }
}
