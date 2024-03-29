package irvine.oeis.a143;
// Generated by gen_pattern.pl - DO NOT EDIT here!

import irvine.oeis.recur.GeneratingFunctionSequence;

/**
 * A143403 Expansion of x^k/Product_{t=k..2k} (1-tx) for k=8.
 * @author Georg Fischer
 */
public class A143403 extends GeneratingFunctionSequence {

  /** Construct the sequence. */
  public A143403() {
    super(0, new long[] {0, 0, 0, 0, 0, 0, 0, 0, 1},
      new long[] {1, -108, 5154, -142632, 2522289, -29554812, 229442156, -1137868848L, 
      3270729600L, -4151347200L});
  }
}
