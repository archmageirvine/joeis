package irvine.oeis.a322;
// Generated by gen_pattern.pl - DO NOT EDIT here!

import irvine.oeis.recur.GeneratingFunctionSequence;

/**
 * A322116 Main diagonal of triangle A321600; a(n) = A321600(n,n-1) for n &gt;= 1.
 * @author Georg Fischer
 */
public class A322116 extends GeneratingFunctionSequence {

  /** Construct the sequence. */
  public A322116() {
    super(1, new long[] {0, 2, 0, 6},
      new long[] {1, -3, -1, 3});
  }
}
