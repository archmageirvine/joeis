package irvine.oeis.a007;

import irvine.math.matrix.DefaultMatrix;
import irvine.math.z.Z;

/**
 * A007203.
 * @author Sean A. Irvine
 */
public class A007203 extends A007104 {

  @Override
  protected boolean accept(final DefaultMatrix<Z> matrix, final Z n) {
    return Z.ONE.equals(MAT.det(matrix).abs()) && n.equals(MAT.trace(matrix));
  }
}
