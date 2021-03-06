package irvine.oeis.a320;
// Generated by gen_seq4.pl nest at 2020-12-29 12:34
// DO NOT EDIT here!

import irvine.oeis.NestedSequence;
import irvine.oeis.a000.A000720;
import irvine.oeis.a031.A031930;


/**
 * A320704 Indices of primes followed by a gap (distance to next larger prime) of 12.
 * Formula: <code>a(n) = A000720(A031930(n)).</code>
 * @author Georg Fischer
 */
public class A320704 extends NestedSequence {

  /** Construct the sequence. */
  public A320704() {
    super(1, new A000720(), new A031930(), 1, 1); 
  }

}
