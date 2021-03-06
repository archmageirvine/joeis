package irvine.oeis.a199;
// Generated by gen_seq4.pl nest at 2020-12-29 12:34
// DO NOT EDIT here!

import irvine.oeis.NestedSequence;
import irvine.oeis.a000.A000040;
import irvine.oeis.a031.A031347;


/**
 * A199975 Multiplicative digital root of n-th prime.
 * Formula: <code>a(n) = A031347(A000040(n)).</code>
 * @author Georg Fischer
 */
public class A199975 extends NestedSequence {

  /** Construct the sequence. */
  public A199975() {
    super(1, new A031347(), new A000040(), 0, 1); 
  }

}
