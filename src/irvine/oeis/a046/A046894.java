package irvine.oeis.a046;

import irvine.oeis.LimitedSumOfPrimePowersSequence;

/**
 * A046894 Numbers expressible as p^3 + q^3 with p, q prime in at least two ways.
 * @author Sean A. Irvine
 */
public class A046894 extends LimitedSumOfPrimePowersSequence {

  /** Construct the sequence. */
  public A046894() {
    super(3, 2, 2);
  }
}
