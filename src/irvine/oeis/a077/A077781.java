package irvine.oeis.a077;

import irvine.oeis.a183.A183179;
import irvine.oeis.transform.SimpleTransformSequence;

/**
 * A077781 Numbers k such that 7*(10^k - 1)/9 - 3*10^floor(k/2) is a palindromic wing prime (also known as near-repdigit palindromic prime).
 * @author Sean A. Irvine
 */
public class A077781 extends SimpleTransformSequence {

  /** Construct the sequence. */
  public A077781() {
    super(1, new A183179(), k -> k.multiply2().add(1));
  }
}

