package irvine.oeis.a077;

import irvine.oeis.a107.A107127;
import irvine.oeis.transform.SimpleTransformSequence;

/**
 * A077789 Numbers k such that (10^k - 1)/9 + 6*10^floor(k/2) is a palindromic wing prime (a.k.a. near-repdigit palindromic prime).
 * @author Sean A. Irvine
 */
public class A077789 extends SimpleTransformSequence {

  /** Construct the sequence. */
  public A077789() {
    super(1, new A107127().skip(), k -> k.multiply2().add(1));
  }
}

