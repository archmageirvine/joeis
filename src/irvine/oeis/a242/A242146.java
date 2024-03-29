package irvine.oeis.a242;
// Generated by gen_pattern.pl - DO NOT EDIT here!

import irvine.oeis.Conjectural;
import irvine.oeis.recur.GeneratingFunctionSequence;

/**
 * A242146 Number of length 2+5 0..n arrays with no consecutive six elements summing to more than 3*n.
 * @author Georg Fischer
 */
public class A242146 extends GeneratingFunctionSequence implements Conjectural {


  /** Construct the sequence. */
  public A242146() {
    super(1, new long[] {0, 74, 521, 1030, 348, 90, -28, 8, -1},
      new long[] {1, -8, 28, -56, 70, -56, 28, -8, 1});
  }
}
