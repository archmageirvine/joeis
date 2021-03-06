package irvine.oeis.a053;
// Generated by gen_seq4.pl nest at 2020-12-29 12:34
// DO NOT EDIT here!

import irvine.oeis.NestedSequence;
import irvine.oeis.a000.A000010;
import irvine.oeis.a007.A007814;


/**
 * A053574 Exponent of 2 in phi(n) where phi(n) = A000010(n).
 * Formula: <code>a(n) = A007814(A000010(n)).</code>
 * @author Georg Fischer
 */
public class A053574 extends NestedSequence {

  /** Construct the sequence. */
  public A053574() {
    super(1, new A007814(), new A000010(), 1, 1); 
  }

}
