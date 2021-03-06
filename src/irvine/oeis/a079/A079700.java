package irvine.oeis.a079;
// Generated by gen_seq4.pl nest at 2020-12-29 12:34
// DO NOT EDIT here!

import irvine.oeis.NestedSequence;
import irvine.oeis.a005.A005277;
import irvine.oeis.a007.A007814;


/**
 * A079700 a(n) is the 2-adic valuation of the n-th even nontotient.
 * Formula: <code>a(n) = A007814(A005277(n)).</code>
 * @author Georg Fischer
 */
public class A079700 extends NestedSequence {

  /** Construct the sequence. */
  public A079700() {
    super(1, new A007814(), new A005277(), 1, 1); 
  }

}
