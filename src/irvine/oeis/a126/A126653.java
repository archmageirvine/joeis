package irvine.oeis.a126;

import irvine.oeis.FiniteSequence;

/**
 * A126653 A 3 X 3 magic square with magic sum 45: the Loh-Shu square A033812 multiplied by 3.
 * @author Georg Fischer
 */
public class A126653 extends FiniteSequence {

  /** Construct the sequence. */
  public A126653() {
    super(24, 3, 18, 9, 15, 21, 12, 27, 6);
  }
}
