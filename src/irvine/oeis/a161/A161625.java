package irvine.oeis.a161;
// Generated by gen_seq4.pl nest at 2020-12-29 12:34
// DO NOT EDIT here!

import irvine.oeis.NestedSequence;
import irvine.oeis.a000.A000217;
import irvine.oeis.a007.A007652;


/**
 * A161625 Sum of all numbers from 1 up to the final digit of prime(n).
 * Formula: <code>a(n) = A000217(A007652(n)).</code>
 * @author Georg Fischer
 */
public class A161625 extends NestedSequence {

  /** Construct the sequence. */
  public A161625() {
    super(1, new A000217(), new A007652(), 0, 1); 
  }

}
