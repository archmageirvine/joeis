package irvine.oeis.a007;

import irvine.math.matrix.DefaultMatrix;
import irvine.math.z.Z;

/**
 * A007295.
 * @author Sean A. Irvine
 */
public class A007295 extends A007104 {

  @Override
  protected boolean accept(final DefaultMatrix<Z> matrix, final Z n) {
    return Z.ONE.equals(MAT.det(matrix).abs()) && MAT.trace(matrix).compareTo(n) <= 0;
  }
}
