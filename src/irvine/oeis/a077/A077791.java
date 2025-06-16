package irvine.oeis.a077;

import irvine.oeis.a107.A107648;
import irvine.oeis.transform.SimpleTransformSequence;

/**
 * A077791 Numbers k such that (10^k - 1)/9 + 7*10^floor(k/2) is a palindromic wing prime (a.k.a. near-repdigit palindromic prime).
 * @author Sean A. Irvine
 */
public class A077791 extends SimpleTransformSequence {

  /** Construct the sequence. */
  public A077791() {
    super(1, new A107648(), k -> k.multiply2().add(1));
  }
}

