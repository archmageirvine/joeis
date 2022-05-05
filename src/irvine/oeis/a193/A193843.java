package irvine.oeis.a193;

import irvine.oeis.triangle.Transpose;

/**
 * A193843 Mirror image of the triangle A193842.
 * @author Georg Fischer
 */
public class A193843 extends Transpose {

  /** Construct the sequence. */
  public A193843() {
    super(new A193842());
  }
}
