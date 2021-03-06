package irvine.oeis.a176;
// Generated by gen_seq4.pl nest at 2020-12-29 12:34
// DO NOT EDIT here!

import irvine.oeis.NestedSequence;
import irvine.oeis.a100.A100959;


/**
 * A176363 Non-semiprime numbers of order 2.
 * Formula: <code>a(n) = A100959(A100959(n)).</code>
 * @author Georg Fischer
 */
public class A176363 extends NestedSequence {

  /** Construct the sequence. */
  public A176363() {
    super(1, new A100959(), new A100959(), 1, 1); 
  }

}
