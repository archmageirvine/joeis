package irvine.oeis.a052;
// Generated by gen_seq4.pl nest at 2020-12-29 12:34
// DO NOT EDIT here!

import irvine.oeis.NestedSequence;
import irvine.oeis.a000.A000796;
import irvine.oeis.a005.A005589;


/**
 * A052384 Number of letters in the n-th decimal digit of Pi (in English).
 * Formula: <code>a(n) = A005589(A000796(n)).</code>
 * @author Georg Fischer
 */
public class A052384 extends NestedSequence {

  /** Construct the sequence. */
  public A052384() {
    super(2, new A005589(), new A000796(), 0, 1); 
  }

}
