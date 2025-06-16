package irvine.oeis.a077;

import irvine.oeis.a183.A183186;
import irvine.oeis.transform.SimpleTransformSequence;

/**
 * A077786 Numbers k such that (10^k - 1) - 4*10^floor(k/2) is a palindromic wing prime (a.k.a. near-repdigit palindromic prime).
 * @author Sean A. Irvine
 */
public class A077786 extends SimpleTransformSequence {

  /** Construct the sequence. */
  public A077786() {
    super(1, new A183186(), k -> k.multiply2().add(1));
  }
}

