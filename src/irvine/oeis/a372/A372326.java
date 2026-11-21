package irvine.oeis.a372;

import irvine.math.z.Z;
import irvine.oeis.a267.A267383;

/**
 * A372326 Number A(n,k) of acyclic orientations of the Turán graph T(k*n,n); square array A(n,k), n&gt;=0, k&gt;=1, read by antidiagonals.
 * @author Gregory Morse
 */
public class A372326 extends A372254 {
  private final A267383 mTuran = new A267383();

  @Override
  protected Z t(final int n, final int k) {
    return n == 0 || k == 0 ? Z.ONE : mTuran.matrixElement(n * k, n);
  }
}
