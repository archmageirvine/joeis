package irvine.oeis.a193;
// Generated by gen_pattern.pl - DO NOT EDIT here!

import irvine.oeis.recur.GeneratingFunctionSequence;

/**
 * A193577 a(n) = 5*7^n.
 * @author Georg Fischer
 */
public class A193577 extends GeneratingFunctionSequence {

  /** Construct the sequence. */
  public A193577() {
    super(0, new long[] {5},
      new long[] {1, -7});
  }
}
