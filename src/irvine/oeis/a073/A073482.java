package irvine.oeis.a073;
// Generated by gen_seq4.pl nest at 2020-12-29 12:34
// DO NOT EDIT here!

import irvine.oeis.NestedSequence;
import irvine.oeis.a005.A005117;
import irvine.oeis.a006.A006530;


/**
 * A073482 Largest prime factor of the n-th squarefree number.
 * Formula: <code>a(n) = A006530(A005117(n)).</code>
 * @author Georg Fischer
 */
public class A073482 extends NestedSequence {

  /** Construct the sequence. */
  public A073482() {
    super(1, new A006530(), new A005117(), 1, 1); 
  }

}
