package irvine.oeis.a244;
// Generated by gen_seq4.pl nest at 2020-12-29 12:34
// DO NOT EDIT here!

import irvine.oeis.NestedSequence;
import irvine.oeis.a000.A000035;
import irvine.oeis.a014.A014418;


/**
 * A244221 Parity of Greedy Catalan Base representation for n: a(n) = A014418(n) reduced modulo 2.
 * Formula: <code>a(n) = A000035(A014418(n)).</code>
 * @author Georg Fischer
 */
public class A244221 extends NestedSequence {

  /** Construct the sequence. */
  public A244221() {
    super(0, new A000035(), new A014418(), 0, 0); 
  }

}
