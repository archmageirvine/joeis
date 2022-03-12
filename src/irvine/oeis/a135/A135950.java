package irvine.oeis.a135;

import irvine.oeis.a022.A022166;
import irvine.oeis.triangle.Inverse;

/**
 * A135950 Matrix inverse of triangle A022166.
 * @author Georg Fischer
 */
public class A135950 extends Inverse {

  /** Construct the sequence. */
  public A135950() {
    super(new A022166());
  }
}
