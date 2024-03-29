package irvine.oeis.a215;
// Generated by gen_seq4.pl rebase at 2020-11-30 22:51
// DO NOT EDIT here!

import irvine.oeis.a037.A037454;

/**
 * A215092 a(n) = Sum_{i=0..m} d(i)*3^i, where Sum_{i=0..m} d(i)*6^i is the base-6 representation of n.
 * @author Georg Fischer
 */
public class A215092 extends A037454 {

  /** Construct the sequence. */
  public A215092() {
    super(1, 6, 3);
  }
}
