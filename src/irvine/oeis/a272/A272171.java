package irvine.oeis.a272;
// Generated by gen_seq4.pl nest at 2020-12-29 12:34
// DO NOT EDIT here!

import irvine.oeis.NestedSequence;
import irvine.oeis.a000.A000005;
import irvine.oeis.a004.A004736;


/**
 * A272171 Triangle read by rows: T(n,k) in which row n lists the first n terms of A000005 in reverse order.
 * Formula: <code>a(n) = A000005(A004736(n)).</code>
 * @author Georg Fischer
 */
public class A272171 extends NestedSequence {

  /** Construct the sequence. */
  public A272171() {
    super(1, new A000005(), new A004736(), 1, 1); 
  }

}
