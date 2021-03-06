package irvine.oeis.a336;
// Generated by gen_seq4.pl nest at 2020-12-29 12:34
// DO NOT EDIT here!

import irvine.oeis.NestedSequence;
import irvine.oeis.a000.A000265;
import irvine.oeis.a003.A003958;


/**
 * A336466 Fully multiplicative with a(p) = A000265(p-1) for any prime p, where A000265(k) gives the odd part of k.
 * Formula: <code>a(n) = A000265(A003958(n)).</code>
 * @author Georg Fischer
 */
public class A336466 extends NestedSequence {

  /** Construct the sequence. */
  public A336466() {
    super(1, new A000265(), new A003958(), 1, 1); 
  }

}
