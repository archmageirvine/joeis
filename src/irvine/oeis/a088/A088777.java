package irvine.oeis.a088;
// Generated by gen_seq4.pl quots at 2021-11-26 23:52

import irvine.oeis.SelfQuotientSequence;
import irvine.oeis.a082.A082782;

/**
 * A088777 a(n) = A082782(n+1)/A082782(n).
 * @author Georg Fischer
 */
public class A088777 extends SelfQuotientSequence {

  /** Construct the sequence. */
  public A088777() {
    super(new A082782(), 1);
  }
}
