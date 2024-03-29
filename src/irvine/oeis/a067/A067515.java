package irvine.oeis.a067;
// Generated by gen_seq4.pl nest at 2020-12-29 12:34
// DO NOT EDIT here!

import irvine.oeis.NestedSequence;
import irvine.oeis.a000.A000045;
import irvine.oeis.a020.A020995;


/**
 * A067515 Fibonacci numbers with index = digit sum.
 * Formula: <code>a(n) = A000045(A020995(n)).</code>
 * @author Georg Fischer
 */
public class A067515 extends NestedSequence {

  /** Construct the sequence. */
  public A067515() {
    super(1, new A000045(), new A020995(), 0, 1); 
  }

}
