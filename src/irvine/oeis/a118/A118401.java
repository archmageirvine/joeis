package irvine.oeis.a118;

import irvine.oeis.triangle.Inverse;

/**
 * A118401 Triangle, read by rows, equal to the matrix square of triangle A118400; also equals the matrix inverse of triangle A118407.
 * @author Georg Fischer
 */
public class A118401 extends Inverse {

  /** Construct the sequence. */
  public A118401() {
    super(0, new A118407());
  }
}
