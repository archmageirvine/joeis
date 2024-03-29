package irvine.oeis.a286;
// Generated by patch_prepend.pl 2023-06-19 07:07

import irvine.oeis.PrependSequence;
import irvine.oeis.a164.A164457;

/**
 * A286938 Length of n-th iterate of the mapping 00-&gt;001, 1-&gt;10, as in A284932.
 * @author Georg Fischer
 */
public class A286938 extends PrependSequence {

  /** Construct the sequence. */
  public A286938() {
    super(new A164457().skip(3), 2, 3, 5);
  }
}
