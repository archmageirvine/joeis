package irvine.oeis.a077;

import irvine.oeis.a183.A183182;
import irvine.oeis.transform.SimpleTransformSequence;

/**
 * A077793 Numbers k such that 7*(10^k - 1)/9 + 10^floor(k/2) is a palindromic wing prime (a.k.a. near-repdigit palindromic prime).
 * @author Sean A. Irvine
 */
public class A077793 extends SimpleTransformSequence {

  /** Construct the sequence. */
  public A077793() {
    super(1, new A183182(), k -> k.multiply2().add(1));
  }
}

