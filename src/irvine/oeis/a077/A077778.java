package irvine.oeis.a077;

import irvine.oeis.a115.A115073;
import irvine.oeis.transform.SimpleTransformSequence;

/**
 * A077778 Numbers k such that (10^k - 1) - 7*10^floor(k/2) is a palindromic wing prime (a.k.a. near-repdigit palindromic prime).
 * @author Sean A. Irvine
 */
public class A077778 extends SimpleTransformSequence {

  /** Construct the sequence. */
  public A077778() {
    super(1, new A115073(), k -> k.multiply2().add(1));
  }
}

