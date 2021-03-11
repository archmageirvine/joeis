package irvine.oeis.a044;

import irvine.oeis.GeneratingFunctionSequence;

/**
 * A044043 Number of tilings of 2 X n rectangle with polyominoes, each of which has area = # of adjacent polyominoes.
 * @author Sean A. Irvine
 */
public class A044043 extends GeneratingFunctionSequence {

  // Empirical: DO NOT USE TO EXTEND THE SEQUENCE

  /** Construct the sequence. */
  public A044043() {
    super(1, new long[] {0, 0, 0, 2, 5, 3, 3, 4, 4, 0, 0, 2}, new long[] {1, 0, 0, -3, -2, -1, -3, -4, 0, 0, -2});
  }
}

