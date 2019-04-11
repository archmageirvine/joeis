package irvine.oeis.a169;

import irvine.oeis.FiniteSequence;

/**
 * A169926 Values of <code>n &gt;= 0</code> such that <code>3*n-45+360/(n/2+8)</code> is an integer.
 * @author Georg Fischer
 */
public class A169926 extends FiniteSequence {

  /** Construct the sequence. */
  public A169926() {
    super(0, 2, 4, 8, 14, 20, 24, 29, 32, 44, 56, 64, 74, 104, 128, 164, 224, 344, 704);
  }
}
