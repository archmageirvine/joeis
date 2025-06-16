package irvine.oeis.a077;

import irvine.oeis.a183.A183185;
import irvine.oeis.transform.SimpleTransformSequence;

/**
 * A077782 Numbers k such that (10^k - 1) - 5*10^floor(m/2) is a palindromic wing prime (a.k.a. near-repdigit palindromic prime).
 * @author Sean A. Irvine
 */
public class A077782 extends SimpleTransformSequence {

  /** Construct the sequence. */
  public A077782() {
    super(1, new A183185(), k -> k.multiply2().add(1));
  }
}

