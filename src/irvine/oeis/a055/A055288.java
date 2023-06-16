package irvine.oeis.a055;

import irvine.oeis.triangle.Inverse;
import irvine.oeis.triangle.SubTriangle;

/**
 * A055288 Matrix inverse of triangle A055277(n+1,k).
 * @author Georg Fischer
 */
public class A055288 extends Inverse {

  /** Construct the sequence. */
  public A055288() {
    super(1, new SubTriangle(new A055277(), 1));
  }
}
