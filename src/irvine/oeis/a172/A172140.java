package irvine.oeis.a172;
// Generated by gen_pattern.pl - DO NOT EDIT here!

import irvine.oeis.recur.GeneratingFunctionSequence;

/**
 * A172140 Number of ways to place 5 nonattacking zebras on an n X n board.
 * @author Georg Fischer
 */
public class A172140 extends GeneratingFunctionSequence {

  /** Construct the sequence. */
  public A172140() {
    super(1, new long[] {0, 0, 0, -126, -646, -5080, -26144, 3866, 43362, -257964, 550076, 
      -606448, 364576, -123272, 112920, -201668, 185596, -87744, 20904, 
      -4252, 2900, -1296, 200},
      new long[] {-1, 11, -55, 165, -330, 462, -462, 330, -165, 55, -11, 1});
  }
}
