package irvine.oeis.a030;

import irvine.oeis.FiniteSequence;

/**
 * A030643 Map 1 to A, 2 to B, ... 26 to Z and 0 to space and the sequence reads: "NUMBER SERIES".
 * @author Georg Fischer
 */
public class A030643 extends FiniteSequence {

  /** Construct the sequence. */
  public A030643() {
    super(14, 21, 13, 2, 5, 18, 0, 19, 5, 18, 9, 5, 19);
  }
}
