package irvine.oeis.a246;
// Generated by gen_seq4.pl nest at 2020-12-29 12:34
// DO NOT EDIT here!

import irvine.oeis.NestedSequence;
import irvine.oeis.a000.A000040;
import irvine.oeis.a032.A032527;


/**
 * A246010 a(n) = floor(5*prime(n)^2 / 4).
 * Formula: <code>a(n) = A032527(A000040(n)).</code>
 * @author Georg Fischer
 */
public class A246010 extends NestedSequence {

  /** Construct the sequence. */
  public A246010() {
    super(1, new A032527(), new A000040(), 0, 1); 
  }

}
