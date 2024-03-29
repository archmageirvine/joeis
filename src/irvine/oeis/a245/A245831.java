package irvine.oeis.a245;
// Generated by gen_pattern.pl - DO NOT EDIT here!

import irvine.oeis.recur.GeneratingFunctionSequence;

/**
 * A245831 The Szeged index of the coronene/circumcoronene benzenoid H_k (see Fig. 5 of the Gutman &amp; Klavzar reference or Fig. 5.7 of the Diudea et al. reference).
 * @author Georg Fischer
 */
public class A245831 extends GeneratingFunctionSequence {

  /** Construct the sequence. */
  public A245831() {
    super(1, new long[] {0, 54, 3060, 16326, 16326, 3060, 54},
      new long[] {1, -7, 21, -35, 35, -21, 7, -1});
  }
}
