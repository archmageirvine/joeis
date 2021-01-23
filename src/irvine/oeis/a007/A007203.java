package irvine.oeis.a007;

import irvine.math.matrix.DefaultMatrix;
import irvine.math.z.Z;

/**
 * A007203 Number of elements (a b / c d) in GL(2,Z) with |det| = 1, trace n and 0 &lt;= a &lt;= {b, c} &lt;= d.
 * @author Sean A. Irvine
 */
public class A007203 extends A007104 {

  @Override
  protected boolean accept(final DefaultMatrix<Z> matrix, final Z n) {
    return Z.ONE.equals(MAT.det(matrix).abs()) && n.equals(MAT.trace(matrix));
  }
}
