package irvine.oeis.a322;
// Generated by gen_pattern.pl - DO NOT EDIT here!

import irvine.oeis.recur.GeneratingFunctionSequence;

/**
 * A322709 a(0)=0, a(1)=7 and a(n) = 30*a(n-1) - a(n-2) + 14 for n &gt; 1.
 * @author Georg Fischer
 */
public class A322709 extends GeneratingFunctionSequence {

  /** Construct the sequence. */
  public A322709() {
    super(0, new long[] {0, 7, 7},
      new long[] {1, -31, 31, -1});
  }
}
