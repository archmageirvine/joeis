package irvine.oeis.a202;
// Generated by gen_pattern.pl - DO NOT EDIT here!

import irvine.oeis.Conjectural;
import irvine.oeis.recur.GeneratingFunctionSequence;

/**
 * A202458 Number of (n+2) X 7 binary arrays with consecutive windows of three bits considered as a binary number nondecreasing in every row and column.
 * @author Georg Fischer
 */
public class A202458 extends GeneratingFunctionSequence implements Conjectural {


  /** Construct the sequence. */
  public A202458() {
    super(1, new long[] {0, 1728, -9687, 24626, -36022, 32318, -17650, 5408, -715},
      new long[] {1, -8, 28, -56, 70, -56, 28, -8, 1});
  }
}
