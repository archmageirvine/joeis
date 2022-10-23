package irvine.oeis.a202;

import irvine.oeis.triangle.Transpose;

/**
 * A202452 Lower triangular Fibonacci matrix, by SW antidiagonals.
 * @author Georg Fischer
 */
public class A202452 extends Transpose {

  /** Construct the sequence. */
  public A202452() {
    super(1, new A202451());
  }
}
