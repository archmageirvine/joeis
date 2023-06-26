package irvine.oeis.a169;

import irvine.oeis.FiniteSequence;

/**
 * A169925 Integer values of 4*n-40+360/(n+9) (see A169924).
 * @author Georg Fischer
 */
public class A169925 extends FiniteSequence {

  /** Construct the sequence. */
  public A169925() {
    super(1, FINITE, 0, 0, 2, 8, 16, 22, 35, 56, 78, 93, 112, 170, 217, 288, 407, 646, 1365);
  }
}
