package irvine.oeis.a007;

import irvine.math.matrix.DefaultMatrix;
import irvine.math.z.Z;

/**
 * A007295 Number of elements (a b, c d) in GL(2,Z) with |det| = 1, trace &lt;= n and 0 &lt;= a &lt;= {b, c} &lt;= d.
 * @author Sean A. Irvine
 */
public class A007295 extends A007104 {

  @Override
  protected boolean accept(final DefaultMatrix<Z> matrix, final Z n) {
    return Z.ONE.equals(MAT.det(matrix).abs()) && MAT.trace(matrix).compareTo(n) <= 0;
  }
}
