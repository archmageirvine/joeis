package irvine.oeis.a121;

import irvine.oeis.recur.LinearRecurrence;

/**
 * A121230 First Hadamard-Sylvester matrix self -similar matrix based on the Padovan/ Minimal Pisot 3 X 3 matrix as an 9 X 9 matrix: Characteristic Polynomial:1 - x - x^3 - x^4 - x^5 + 3 x^6 + 2 x^7 - x^9.
 * @author Sean A. Irvine
 */
public class A121230 extends LinearRecurrence {

  /** Construct the sequence. */
  public A121230() {
    super(new long[] {-1, 1, -1, 1, 1, 1}, new long[] {0, 13, 5, 22, 42, 54});
  }
}
