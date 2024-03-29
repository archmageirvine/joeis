package irvine.oeis.a259;
// Generated by gen_seq4.pl nest at 2020-12-29 12:34
// DO NOT EDIT here!

import irvine.oeis.NestedSequence;
import irvine.oeis.a000.A000326;
import irvine.oeis.a020.A020639;


/**
 * A259649 Smallest prime factor of the n-th pentagonal number (A000326).
 * Formula: <code>a(n) = A020639(A000326(n)).</code>
 * @author Georg Fischer
 */
public class A259649 extends NestedSequence {

  /** Construct the sequence. */
  public A259649() {
    super(2, new A020639(), new A000326(), 1, 0); 
  }

}
