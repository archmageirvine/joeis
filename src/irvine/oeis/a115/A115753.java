package irvine.oeis.a115;
// Generated by gen_seq4.pl padding 1 at 2020-08-22 18:36

import irvine.oeis.recur.PaddingSequence;

/**
 * A115753 If a(n) is a k-digit number, a(n+1) is the product of the number formed by the initial k-1 digits of a(n) and the final digit of a(n). If k=1, set a(n+1) = 0.
 * @author Georg Fischer
 */
public class A115753 extends PaddingSequence {

  /** Construct the sequence. */
  public A115753() {
    super(1, new long[]{11419, 10269, 9234, 3692, 738, 584, 232, 46, 24, 8}, new long[]{0});
  }
}
