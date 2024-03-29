package irvine.oeis.a086;
// Generated by gen_seq4.pl nest at 2020-12-29 12:34
// DO NOT EDIT here!

import irvine.oeis.NestedSequence;
import irvine.oeis.a002.A002473;
import irvine.oeis.a003.A003415;


/**
 * A086300 Arithmetic derivative of 7-smooth numbers.
 * Formula: <code>a(n) = A003415(A002473(n)).</code>
 * @author Georg Fischer
 */
public class A086300 extends NestedSequence {

  /** Construct the sequence. */
  public A086300() {
    super(1, new A003415(), new A002473(), 0, 1); 
  }

}
