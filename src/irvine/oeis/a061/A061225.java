package irvine.oeis.a061;
// Generated by gen_pattern.pl - DO NOT EDIT here!

import irvine.oeis.recur.GeneratingFunctionSequence;

/**
 * A061225 Numbers of the form k^3 + (k + 1)^4 + (k + 2)^5 + (k + 3)^6.
 * @author Georg Fischer
 */
public class A061225 extends GeneratingFunctionSequence {

  /** Construct the sequence. */
  public A061225() {
    super(0, new long[] {762, -978, 2248, -2296, 1374, -454, 64},
      new long[] {1, -7, 21, -35, 35, -21, 7, -1});
  }
}
