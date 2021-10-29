package irvine.oeis.a185;

import irvine.math.z.Z;
import irvine.oeis.triangle.UpperLeftTriangle;

/**
 * A185914 Array: T(n,k)=k-n+1 for k&gt;=n; T(n,k)=0 for k&lt;n; by antidiagonals.
 * @author Georg Fischer
 */
public class A185914 extends UpperLeftTriangle {

  @Override
  public Z matrixElement(int n, int k) {
    ++n;
    ++k;
    return Z.valueOf(k >= n ? k - n + 1 : 0);
  }
}
