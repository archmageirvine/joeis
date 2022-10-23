package irvine.oeis.a053;

import irvine.oeis.triangle.Transpose;

/**
 * A053219 Reverse of triangle A053218, read by rows.
 * @author Georg Fischer
 */
public class A053219 extends Transpose {

  /** Construct the sequence. */
  public A053219() {
    super(1, new A053218());
  }
}
