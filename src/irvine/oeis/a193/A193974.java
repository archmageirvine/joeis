package irvine.oeis.a193;

import irvine.oeis.triangle.Transpose;

/**
 * A193974 Mirror of the triangle A193973.
 * @author Georg Fischer
 */
public class A193974 extends Transpose {

  /** Construct the sequence. */
  public A193974() {
    super(new A193973());
  }
}
