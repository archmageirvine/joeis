package irvine.oeis.a077;

import irvine.oeis.a183.A183178;
import irvine.oeis.transform.SimpleTransformSequence;

/**
 * A077777 Numbers k such that 7*(10^k - 1)/9 - 5*10^floor(k/2) is a palindromic wing prime (a.k.a. near-repdigit palindromic prime).
 * @author Sean A. Irvine
 */
public class A077777 extends SimpleTransformSequence {

  /** Construct the sequence. */
  public A077777() {
    super(1, new A183178().skip(), k -> k.multiply2().add(1));
  }
}

