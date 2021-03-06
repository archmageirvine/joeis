package irvine.oeis.a100;
// Generated by gen_seq4.pl nest at 2020-12-29 12:34
// DO NOT EDIT here!

import irvine.oeis.NestedSequence;
import irvine.oeis.a000.A000079;
import irvine.oeis.a032.A032741;


/**
 * A100577 Number of sets of divisors of n with an odd sum.
 * Formula: <code>a(n) = A000079(A032741(n)).</code>
 * @author Georg Fischer
 */
public class A100577 extends NestedSequence {

  /** Construct the sequence. */
  public A100577() {
    super(1, new A000079(), new A032741(), 0, 0); 
  }

}
