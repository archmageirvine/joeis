package irvine.oeis.a067;
// Generated by gen_seq4.pl nest at 2020-12-29 12:34
// DO NOT EDIT here!

import irvine.oeis.NestedSequence;
import irvine.oeis.a000.A000203;
import irvine.oeis.a007.A007918;


/**
 * A067792 a(n) is the least prime &gt;= sigma(n).
 * Formula: <code>a(n) = A007918(A000203(n)).</code>
 * @author Georg Fischer
 */
public class A067792 extends NestedSequence {

  /** Construct the sequence. */
  public A067792() {
    super(1, new A007918(), new A000203(), 0, 1); 
  }

}
