package irvine.oeis.a121;

import irvine.oeis.LinearRecurrence;

/**
 * A121230 First Hadamard-Sylvester matrix self <code>-similar</code> matrix based on the <code>Padovan/</code> Minimal Pisot <code>3 X 3</code> matrix as an <code>9 X 9</code> matrix: Characteristic <code>Polynomial:1 - x - x^3 - x^4 - x^5 + 3 x^6 + 2 x^7 - x^9</code>.
 * @author Sean A. Irvine
 */
public class A121230 extends LinearRecurrence {

  /** Construct the sequence. */
  public A121230() {
    super(new long[] {-1, 1, -1, 1, 1, 1}, new long[] {0, 13, 5, 22, 42, 54});
  }
}
