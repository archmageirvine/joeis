package irvine.oeis.a295;
// Generated by gen_seq4.pl nest at 2020-12-29 12:34
// DO NOT EDIT here!

import irvine.oeis.NestedSequence;
import irvine.oeis.a000.A000188;
import irvine.oeis.a003.A003557;


/**
 * A295658 Multiplicative with a(p^e) = p^max(0,(floor(e/2)-1)).
 * Formula: <code>a(n) = A003557(A000188(n)).</code>
 * @author Georg Fischer
 */
public class A295658 extends NestedSequence {

  /** Construct the sequence. */
  public A295658() {
    super(1, new A003557(), new A000188(), 1, 1); 
  }

}
