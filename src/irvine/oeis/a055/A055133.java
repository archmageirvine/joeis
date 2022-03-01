package irvine.oeis.a055;

import irvine.oeis.a008.A008459;
import irvine.oeis.triangle.Inverse;

/**
 * A055133 Matrix inverse of A008459 (squares of entries of Pascal's triangle).
 * @author Georg Fischer
 */
public class A055133 extends Inverse {

  /** Construct the sequence. */
  public A055133() {
    super(new A008459());
  }
}
