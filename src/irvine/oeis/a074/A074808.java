package irvine.oeis.a074;

import irvine.oeis.InverseSequence;

/**
 * A074808 Let f(n) be 2n + POD(n) + 1 if n is even, otherwise 2n - POD(n) - 1, where POD(n) is the product of digits of n. Sequence gives smallest number requiring n iterations to reach a prime.
 * @author Sean A. Irvine
 */
public class A074808 extends InverseSequence {

  /** Construct the sequence. */
  public A074808() {
    super(1, 1, new A074807());
  }
}
