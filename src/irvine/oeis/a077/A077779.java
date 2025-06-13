package irvine.oeis.a077;

import irvine.oeis.a107.A107123;
import irvine.oeis.transform.SimpleTransformSequence;

/**
 * A077779 Numbers k such that (10^k - 1)/9 + 2*10^floor(k/2) is a palindromic wing prime (a.k.a. near-repdigit palindromic prime).
 * @author Sean A. Irvine
 */
public class A077779 extends SimpleTransformSequence {

  /** Construct the sequence. */
  public A077779() {
    super(1, new A107123().skip(), k -> k.multiply2().add(1));
  }
}

