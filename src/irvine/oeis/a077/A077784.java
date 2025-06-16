package irvine.oeis.a077;

import irvine.oeis.a183.A183175;
import irvine.oeis.transform.SimpleTransformSequence;

/**
 * A077784 Numbers k such that (10^k - 1)/3 + 2*10^floor(k/2) is a palindromic wing prime (a.k.a. near-repdigit palindromic prime).
 * @author Sean A. Irvine
 */
public class A077784 extends SimpleTransformSequence {

  /** Construct the sequence. */
  public A077784() {
    super(1, new A183175(), k -> k.multiply2().add(1));
  }
}

