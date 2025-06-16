package irvine.oeis.a077;

import irvine.oeis.a183.A183177;
import irvine.oeis.transform.SimpleTransformSequence;

/**
 * A077792 Numbers k such that (10^k - 1)/3 + 5*10^floor(k/2) is a palindromic wing prime (a.k.a. near-repdigit palindromic prime).
 * @author Sean A. Irvine
 */
public class A077792 extends SimpleTransformSequence {

  /** Construct the sequence. */
  public A077792() {
    super(1, new A183177(), k -> k.multiply2().add(1));
  }
}

