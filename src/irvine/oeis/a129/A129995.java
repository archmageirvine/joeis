package irvine.oeis.a129;
// Generated by gen_pattern.pl - DO NOT EDIT here!

import irvine.oeis.recur.GeneratingFunctionSequence;

/**
 * A129995 a(n) = (n + 1)*(n^2 + 2)*(n^3 + 3)*(n^4 + 4)/4!.
 * @author Georg Fischer
 */
public class A129995 extends GeneratingFunctionSequence {

  /** Construct the sequence. */
  public A129995() {
    super(0, new long[] {-1, 6, -165, -2970, -22480, -55969, -51511, -16490, -1595, -25},
      new long[] {-1, 11, -55, 165, -330, 462, -462, 330, -165, 55, -11, 1});
  }
}
