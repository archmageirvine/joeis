package irvine.oeis.a267;
// Generated by gen_seq4.pl nest at 2020-12-29 12:34
// DO NOT EDIT here!

import irvine.oeis.NestedSequence;
import irvine.oeis.a000.A000040;
import irvine.oeis.a005.A005096;


/**
 * A267897 a(n) = prime(n)! - prime(n).
 * Formula: <code>a(n) = A005096(A000040(n)).</code>
 * @author Georg Fischer
 */
public class A267897 extends NestedSequence {

  /** Construct the sequence. */
  public A267897() {
    super(1, new A005096(), new A000040(), 0, 1); 
  }

}
