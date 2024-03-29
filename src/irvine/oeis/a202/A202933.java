package irvine.oeis.a202;
// Generated by gen_pattern.pl - DO NOT EDIT here!

import irvine.oeis.Conjectural;
import irvine.oeis.recur.GeneratingFunctionSequence;

/**
 * A202933 Number of (n+3) X 5 binary arrays with consecutive windows of four bits considered as a binary number nondecreasing in every row and column.
 * @author Georg Fischer
 */
public class A202933 extends GeneratingFunctionSequence implements Conjectural {


  /** Construct the sequence. */
  public A202933() {
    super(1, new long[] {0, 83521, -387270, 723553, -679679, 320618, -60719},
      new long[] {1, -6, 15, -20, 15, -6, 1});
  }
}
