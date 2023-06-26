package irvine.oeis.a037;

import irvine.oeis.FiniteSequence;

/**
 * A037043 3-white numbers: partition digits of n^3 into blocks of 3 starting at right; then sum of these 3-digit numbers equals n.
 * @author Georg Fischer
 */
public class A037043 extends FiniteSequence {

  /** Construct the sequence. */
  public A037043() {
    super(1, FINITE, 0, 1, 297, 1295, 1296, 1405, 1592, 1701, 1702, 1997, 1998, 1999);
  }
}
