package irvine.oeis.a077;

import irvine.oeis.a107.A107125;
import irvine.oeis.transform.SimpleTransformSequence;

/**
 * A077783 Numbers k such that (10^k-1)/9 + 4*10^floor(k/2) is a palindromic wing prime (a.k.a. near-repdigit palindromic prime).
 * @author Sean A. Irvine
 */
public class A077783 extends SimpleTransformSequence {

  /** Construct the sequence. */
  public A077783() {
    super(1, new A107125().skip(), k -> k.multiply2().add(1));
  }
}

