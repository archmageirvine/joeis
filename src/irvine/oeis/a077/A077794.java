package irvine.oeis.a077;

import irvine.oeis.a183.A183187;
import irvine.oeis.transform.SimpleTransformSequence;

/**
 * A077794 Odd integers k such that 10^k - 1 - 10^((k-1)/2) is a prime of the form 9...989...9, called a palindromic wing prime or a near-repdigit palindromic prime.
 * @author Sean A. Irvine
 */
public class A077794 extends SimpleTransformSequence {

  /** Construct the sequence. */
  public A077794() {
    super(1, new A183187(), k -> k.multiply2().add(1));
  }
}

