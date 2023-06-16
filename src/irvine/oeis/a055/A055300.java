package irvine.oeis.a055;

import irvine.oeis.triangle.Inverse;
import irvine.oeis.triangle.SubTriangle;

/**
 * A055300 Matrix inverse of triangle A055290(n+1,k).
 * @author Georg Fischer
 */
public class A055300 extends Inverse {

  /** Construct the sequence. */
  public A055300() {
    super(2, new SubTriangle(new A055290(), 1));
  }
}
