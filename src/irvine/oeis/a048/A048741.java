package irvine.oeis.a048;
// Generated by gen_seq4.pl nest at 2020-12-29 12:34
// DO NOT EDIT here!

import irvine.oeis.NestedSequence;
import irvine.oeis.a002.A002808;
import irvine.oeis.a007.A007956;


/**
 * A048741 Product of aliquot divisors of composite n (1 and primes omitted).
 * Formula: <code>a(n) = A007956(A002808(n)).</code>
 * @author Georg Fischer
 */
public class A048741 extends NestedSequence {

  /** Construct the sequence. */
  public A048741() {
    super(1, new A007956(), new A002808(), 1, 1); 
  }

}
