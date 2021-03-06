package irvine.oeis.a111;
// Generated by gen_seq4.pl nest at 2020-12-29 12:34
// DO NOT EDIT here!

import irvine.oeis.NestedSequence;
import irvine.oeis.a000.A000045;
import irvine.oeis.a066.A066178;


/**
 * A111438 Fibonacci(heptanacci(n)), restricted to nonzero heptanacci numbers.
 * Formula: <code>a(n) = A000045(A066178(n)).</code>
 * @author Georg Fischer
 */
public class A111438 extends NestedSequence {

  /** Construct the sequence. */
  public A111438() {
    super(0, new A000045(), new A066178(), 0, 0); 
  }

}
