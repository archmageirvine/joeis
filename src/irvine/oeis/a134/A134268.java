package irvine.oeis.a134;
// Generated by gen_seq4.pl padding 0 at 2020-08-22 18:36
// DO NOT EDIT here!

import irvine.oeis.recur.PaddingSequence;


/**
 * A134268 a(n+2) = sum_digits[a(n+1)] + sum_digits[a(n)] + sum_digits[a(n+1)]*sum_digits[a(n)], with a(0)=0, a(1)=1.
 * @author Georg Fischer
 */
public class A134268 extends PaddingSequence {

  /** Construct the sequence. */
  public A134268() {
    super(new long[] {0, 1, 3, 19, 54}, new long[] {153, 109, 120, 55});
  }
}
