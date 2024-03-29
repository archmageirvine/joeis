package irvine.oeis.a250;
// Generated by gen_pattern.pl - DO NOT EDIT here!

import irvine.oeis.Conjectural;
import irvine.oeis.recur.GeneratingFunctionSequence;

/**
 * A250882 Number of (5+1) X (n+1) 0..3 arrays with nondecreasing x(i,j)-x(i,j-1) in the i direction and nondecreasing x(i,j)+x(i-1,j) in the j direction.
 * @author Georg Fischer
 */
public class A250882 extends GeneratingFunctionSequence implements Conjectural {


  /** Construct the sequence. */
  public A250882() {
    super(1, new long[] {0, 37130, -17452, 16386, -4096},
      new long[] {1, -4, 6, -4, 1});
  }
}
