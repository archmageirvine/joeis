package irvine.oeis.a065;
// Generated by gen_seq4.pl nest at 2020-12-29 12:34
// DO NOT EDIT here!

import irvine.oeis.NestedSequence;
import irvine.oeis.a000.A000040;
import irvine.oeis.a014.A014688;


/**
 * A065995 a(n) = prime(prime(n) + n).
 * Formula: <code>a(n) = A000040(A014688(n)).</code>
 * @author Georg Fischer
 */
public class A065995 extends NestedSequence {

  /** Construct the sequence. */
  public A065995() {
    super(1, new A000040(), new A014688(), 1, 1); 
  }

}
