package irvine.oeis.a298;
// Generated by gen_seq4.pl nest at 2020-12-29 12:34
// DO NOT EDIT here!

import irvine.oeis.NestedSequence;
import irvine.oeis.a000.A000292;
import irvine.oeis.a068.A068980;


/**
 * A298269 Number of partitions of the n-th tetrahedral number into tetrahedral numbers.
 * Formula: <code>a(n) = A068980(A000292(n)).</code>
 * @author Georg Fischer
 */
public class A298269 extends NestedSequence {

  /** Construct the sequence. */
  public A298269() {
    super(0, new A068980(), new A000292(), 0, 0); 
  }

}
