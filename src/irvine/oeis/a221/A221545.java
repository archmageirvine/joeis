package irvine.oeis.a221;
// Generated by gen_pattern.pl - DO NOT EDIT here!

import irvine.oeis.Conjectural;
import irvine.oeis.recur.GeneratingFunctionSequence;

/**
 * A221545 Number of 0..n arrays of length 7 with each element differing from at least one neighbor by something other than 1, starting with 0.
 * @author Georg Fischer
 */
public class A221545 extends GeneratingFunctionSequence implements Conjectural {


  /** Construct the sequence. */
  public A221545() {
    super(1, new long[] {0, 8, 78, 506, -87, 675, -822, 572, -279, 79, -10},
      new long[] {1, -7, 21, -35, 35, -21, 7, -1});
  }
}
