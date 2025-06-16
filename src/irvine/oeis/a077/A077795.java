package irvine.oeis.a077;

import irvine.oeis.a107.A107649;
import irvine.oeis.transform.SimpleTransformSequence;

/**
 * A077795 Numbers k such that (10^k - 1)/9 + 8*10^floor(k/2) is a palindromic wing prime (a.k.a. near-repdigit palindromic prime).
 * @author Sean A. Irvine
 */
public class A077795 extends SimpleTransformSequence {

  /** Construct the sequence. */
  public A077795() {
    super(1, new A107649(), k -> k.multiply2().add(1));
  }
}

