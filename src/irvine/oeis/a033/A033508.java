package irvine.oeis.a033;

import irvine.oeis.GeneratingFunctionSequence;

/**
 * A033508 Number of matchings in graph P_{5} X P_{n}.
 * @author Sean A. Irvine
 */
public class A033508 extends GeneratingFunctionSequence {

  /** Construct the sequence. */
  public A033508() {
    super(0,
      new long[] {1, -6, -113, 88, 1794, -1994, -6956, 7532, 11175, -9448, -9255, 4700, 3820, -870, -654, 68, 45, -2, -1},
      new long[] {1, -14, -229, 16, 4757, -898, -35106, 26564, 74665, -60482, -73623, 50158, 38553, -17604, -10366, 2538, 1281, -140, -65, 2, 1}
    );
  }
}
