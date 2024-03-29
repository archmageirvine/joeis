package irvine.oeis.a250;
// Generated by gen_pattern.pl - DO NOT EDIT here!

import irvine.oeis.Conjectural;
import irvine.oeis.recur.GeneratingFunctionSequence;

/**
 * A250660 Number of (6+1) X (n+1) 0..1 arrays with nondecreasing x(i,j)-x(i,j-1) in the i direction and nondecreasing min(x(i,j),x(i-1,j)) in the j direction.
 * @author Georg Fischer
 */
public class A250660 extends GeneratingFunctionSequence implements Conjectural {


  /** Construct the sequence. */
  public A250660() {
    super(1, new long[] {0, 319, -383, 128},
      new long[] {1, -3, 3, -1});
  }
}
