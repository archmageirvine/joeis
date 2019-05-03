package irvine.oeis.a126;

import irvine.oeis.FiniteSequence;

/**
 * A126653 A <code>3 X 3</code> magic square with magic sum <code>45</code>: the Loh-Shu square <code>A033812</code> multiplied by 3.
 * @author Georg Fischer
 */
public class A126653 extends FiniteSequence {

  /** Construct the sequence. */
  public A126653() {
    super(24, 3, 18, 9, 15, 21, 12, 27, 6);
  }
}
