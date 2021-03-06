package irvine.oeis.a115;
// Generated by gen_seq4.pl nest at 2020-12-29 12:34
// DO NOT EDIT here!

import irvine.oeis.NestedSequence;
import irvine.oeis.a000.A000045;
import irvine.oeis.a000.A000196;


/**
 * A115338 a(n)=F([sqrt(n)]), where [k]=integer part of k and F(n) is the Fibonacci sequence.
 * Formula: <code>a(n) = A000045(A000196(n)).</code>
 * @author Georg Fischer
 */
public class A115338 extends NestedSequence {

  /** Construct the sequence. */
  public A115338() {
    super(0, new A000045(), new A000196(), 0, 0); 
  }

}
