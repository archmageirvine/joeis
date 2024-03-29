package irvine.oeis.a074;
// Generated by gen_seq4.pl nest at 2020-12-29 12:34
// DO NOT EDIT here!

import irvine.oeis.NestedSequence;
import irvine.oeis.a006.A006530;
import irvine.oeis.a024.A024619;


/**
 * A074593 Largest prime factors of numbers that are not prime powers.
 * Formula: <code>a(n) = A006530(A024619(n)).</code>
 * @author Georg Fischer
 */
public class A074593 extends NestedSequence {

  /** Construct the sequence. */
  public A074593() {
    super(1, new A006530(), new A024619(), 1, 1); 
  }

}
