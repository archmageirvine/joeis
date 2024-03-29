package irvine.oeis.a253;
// Generated by gen_pattern.pl - DO NOT EDIT here!

import irvine.oeis.Conjectural;
import irvine.oeis.recur.GeneratingFunctionSequence;

/**
 * A253225 Number of (n+1) X (2+1) 0..1 arrays with every 2 X 2 subblock diagonal minimum minus antidiagonal minimum nondecreasing horizontally and diagonal maximum minus antidiagonal maximum nondecreasing vertically.
 * @author Georg Fischer
 */
public class A253225 extends GeneratingFunctionSequence implements Conjectural {


  /** Construct the sequence. */
  public A253225() {
    super(1, new long[] {0, 47, -103, 22, 80, -15, -5, -7},
      new long[] {1, -5, 8, -4});
  }
}
