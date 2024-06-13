package irvine.oeis.a070;

import irvine.oeis.RecordSequence;

/**
 * A070744 Records for the index of the (presumably) last palindrome in the 'Reverse and Add' trajectory of n.
 * @author Sean A. Irvine
 */
public class A070744 extends RecordSequence {

  /** Construct the sequence. */
  public A070744() {
    super(1, new A070742());
  }
}
