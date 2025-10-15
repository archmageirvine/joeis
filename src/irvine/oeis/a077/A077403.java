package irvine.oeis.a077;

import irvine.oeis.InverseSequence;

/**
 * A077403 In base 3: smallest number that requires n Reverse and Add! steps to reach a palindrome.
 * @author Sean A. Irvine
 */
public class A077403 extends InverseSequence {

  /** Construct the sequence. */
  public A077403() {
    super(0, 0, new A077402());
  }
}
