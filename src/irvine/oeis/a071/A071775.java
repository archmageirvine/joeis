package irvine.oeis.a071;
// Generated by gen_seq4.pl cofrseq/cofr at 2022-02-27 23:17

import irvine.oeis.a007.A007652;
import irvine.oeis.cons.ContinuedFractionSequence;

/**
 * A071775 Continued fraction for C = 0.23571379....the concatenation of final decimal digits of primes.
 * @author Georg Fischer
 */
public class A071775 extends ContinuedFractionSequence {

  /** Construct the sequence */
  public A071775() {
    super(new A007652());
  }
}
