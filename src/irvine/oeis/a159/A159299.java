package irvine.oeis.a159;

import irvine.oeis.LinearRecurrence;

/**
 * A159299 Number of n-colorings of the <code>4 X 4</code> Sudoku graph.
 * @author Sean A. Irvine
 */
public class A159299 extends LinearRecurrence {

  /** Construct the sequence. */
  public A159299() {
    super(new long[] {1, -17, 136, -680, 2380, -6188, 12376, -19448, 24310, -24310, 19448, -12376, 6188, -2380, 680, -136, 17}, new long[] {0, 0, 0, 0, 288, 166560, 33539040, 2350746720L, 75756999360L, 1388552614848L, 16744788486720L, 146769785743680L, 1002373493948640L, 5606534724167520L, 26640793339768608L, 110556058012152480L, 409297168707073920L});
  }
}
