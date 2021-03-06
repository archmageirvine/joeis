package irvine.oeis.a078;
// Generated by gen_seq4.pl nest at 2020-12-29 12:34
// DO NOT EDIT here!

import irvine.oeis.NestedSequence;
import irvine.oeis.a001.A001414;
import irvine.oeis.a014.A014574;


/**
 * A078577 Sum of all prime factors of the average of n-th twin prime pair.
 * Formula: <code>a(n) = A001414(A014574(n)).</code>
 * @author Georg Fischer
 */
public class A078577 extends NestedSequence {

  /** Construct the sequence. */
  public A078577() {
    super(1, new A001414(), new A014574(), 1, 1); 
  }

}
