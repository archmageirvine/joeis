package irvine.oeis.a172;
// manually linmangf/lingf at 2023-02-23 23:42

import irvine.oeis.recur.GeneratingFunctionSequence;

/**
 * A172211 Number of ways to place 6 nonattacking bishops on a 6 X n board.
 * @author Georg Fischer
 */
public class A172211 extends GeneratingFunctionSequence {

  /** Construct the sequence. */
  public A172211() {
    super(1, "[0,1,9,222,430,1968,6928,18006,-4710,16960,-9360,25832,-30874,61962,-80154,57673,-30525,24048,-22392,19848,-13570,5622,-2266,1654,-1060,596,-220,44,-26,14,-6,2]", "[1,-7,21,-35,35,-21,7,-1]");
  }
}
