package irvine.oeis.a165;

import irvine.oeis.FiniteSequence;

/**
 * A165244 The numbers commonly displayed with 7 segments in electric clocks, in ascending order of number of segments lit.
 * @author Georg Fischer
 */
public class A165244 extends FiniteSequence {

  /** Construct the sequence. */
  public A165244() {
    super(1, 7, 4, 2, 3, 5, 0, 6, 9, 8);
  }
}
