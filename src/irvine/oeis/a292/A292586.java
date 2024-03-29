package irvine.oeis.a292;
// Generated by gen_seq4.pl nest at 2020-12-29 12:34
// DO NOT EDIT here!

import irvine.oeis.NestedSequence;
import irvine.oeis.a001.A001221;
import irvine.oeis.a002.A002110;


/**
 * A292586 a(n) = A002110(A001221(n)) = product of first omega(n) primes.
 * Formula: <code>a(n) = A002110(A001221(n)).</code>
 * @author Georg Fischer
 */
public class A292586 extends NestedSequence {

  /** Construct the sequence. */
  public A292586() {
    super(1, new A002110(), new A001221(), 0, 1); 
  }

}
