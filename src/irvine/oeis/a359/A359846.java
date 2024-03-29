package irvine.oeis.a359;
// Generated by gen_seq4.pl ogf/lingf at 2023-05-01 21:59

import irvine.oeis.recur.GeneratingFunctionSequence;

/**
 * A359846 a(n) = (((5 - (n mod 2))*10^(3 + n*(9/2) - (n mod 2)*(5/2)))^2 + 2)/81.
 * @author Georg Fischer
 */
public class A359846 extends GeneratingFunctionSequence {

  /** Construct the sequence. */
  public A359846() {
    super(0, "[308642,1975000000,-24691360000000000]", "[1,-1,-1000000000000000000,1000000000000000000]");
  }
}
