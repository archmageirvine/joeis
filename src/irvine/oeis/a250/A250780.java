package irvine.oeis.a250;
// Generated by gen_pattern.pl - DO NOT EDIT here!

import irvine.oeis.Conjectural;
import irvine.oeis.recur.GeneratingFunctionSequence;

/**
 * A250780 Number of (n+1) X (5+1) 0..1 arrays with nondecreasing x(i,j)+x(i,j-1) in the i direction and nondecreasing absolute value of x(i,j)-x(i-1,j) in the j direction.
 * @author Georg Fischer
 */
public class A250780 extends GeneratingFunctionSequence implements Conjectural {


  /** Construct the sequence. */
  public A250780() {
    super(1, new long[] {0, 209, -1154, 2693, -3376, 2401, -922, 153},
      new long[] {1, -8, 27, -50, 55, -36, 13, -2});
  }
}
