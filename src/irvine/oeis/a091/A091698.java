package irvine.oeis.a091;

import irvine.oeis.a063.A063967;
import irvine.oeis.triangle.Inverse;

/**
 * A091698 Matrix inverse of triangle A063967.
 * @author Georg Fischer
 */
public class A091698 extends Inverse {

  /** Construct the sequence. */
  public A091698() {
    super(0, new A063967());
  }
}
