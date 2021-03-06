package irvine.oeis.a214;
// Generated by gen_seq4.pl nest at 2020-12-29 12:34
// DO NOT EDIT here!

import irvine.oeis.NestedSequence;
import irvine.oeis.a000.A000040;
import irvine.oeis.a007.A007623;


/**
 * A214617 Primes written in the factorial base.
 * Formula: <code>a(n) = A007623(A000040(n)).</code>
 * @author Georg Fischer
 */
public class A214617 extends NestedSequence {

  /** Construct the sequence. */
  public A214617() {
    super(1, new A007623(), new A000040(), 0, 1); 
  }

}
