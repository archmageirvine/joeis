package irvine.oeis.a007;

import irvine.math.matrix.DefaultMatrix;
import irvine.math.z.Z;

/**
 * A007295 Number of elements <code>(a</code> b, c d) in GL(2,Z) with |det| <code>= 1,</code> trace <code>&lt;= n</code> and <code>0 &lt;= a &lt;=</code> {b, c} <code>&lt;=</code> d.
 * @author Sean A. Irvine
 */
public class A007295 extends A007104 {

  @Override
  protected boolean accept(final DefaultMatrix<Z> matrix, final Z n) {
    return Z.ONE.equals(MAT.det(matrix).abs()) && MAT.trace(matrix).compareTo(n) <= 0;
  }
}
