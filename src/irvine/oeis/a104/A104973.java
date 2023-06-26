package irvine.oeis.a104;

import irvine.oeis.FiniteSequence;

/**
 * A104973 Numbers with 6 distinct digits {1,2,3,4,5,6} such that all adjacent digits (as well as first and last digits) are coprime.
 * @author Georg Fischer
 */
public class A104973 extends FiniteSequence {

  /** Construct the sequence. */
  public A104973() {
    super(1, FINITE, 123456, 143256, 165234, 165432, 216543, 234165, 234561, 256143, 321654, 325614, 341652, 345612, 416523, 432165, 432561, 456123, 523416, 543216, 561234, 561432, 612345, 614325, 652341, 654321);
  }
}
