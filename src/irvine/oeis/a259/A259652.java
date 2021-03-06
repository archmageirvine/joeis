package irvine.oeis.a259;
// Generated by gen_seq4.pl nest at 2020-12-29 12:34
// DO NOT EDIT here!

import irvine.oeis.NestedSequence;
import irvine.oeis.a000.A000326;
import irvine.oeis.a001.A001222;


/**
 * A259652 Number of prime factors, with multiplicity, of the n-th pentagonal number (A000326).
 * Formula: <code>a(n) = A001222(A000326(n)).</code>
 * @author Georg Fischer
 */
public class A259652 extends NestedSequence {

  /** Construct the sequence. */
  public A259652() {
    super(1, new A001222(), new A000326(), 1, 0); 
  }

}
