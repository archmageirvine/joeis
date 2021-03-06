package irvine.oeis.a330;
// Generated by gen_seq4.pl nest at 2020-12-29 12:34
// DO NOT EDIT here!

import irvine.oeis.NestedSequence;
import irvine.oeis.a000.A000720;
import irvine.oeis.a025.A025473;


/**
 * A330669 The prime indices of the prime powers (A000961).
 * Formula: <code>a(n) = A000720(A025473(n)).</code>
 * @author Georg Fischer
 */
public class A330669 extends NestedSequence {

  /** Construct the sequence. */
  public A330669() {
    super(1, new A000720(), new A025473(), 1, 1); 
  }

}
