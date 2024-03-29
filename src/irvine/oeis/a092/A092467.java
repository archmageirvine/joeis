package irvine.oeis.a092;
// Generated by gen_seq4.pl lingf at 2022-11-08 20:17

import irvine.oeis.recur.GeneratingFunctionSequence;

/**
 * A092467 a(n) = Sum_{i+j+k=n, 0&lt;=i,j,k&lt;=n} (n+2k)!/(i! * j! * (3*k)!).
 * @author Georg Fischer
 */
public class A092467 extends GeneratingFunctionSequence {

  /** Construct the sequence. */
  public A092467() {
    super(0, "[1,-4,4]", "[1,-7,12,-8]");
  }
}
