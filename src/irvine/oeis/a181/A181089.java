package irvine.oeis.a181;

import irvine.math.z.Z;
import irvine.oeis.a060.A060821;

/**
 * A181089 Triangle T(n, k) = A060821(n,k) + A060821(n,n-k), read by rows.
 * @author Georg Fischer
 */
public class A181089 extends A060821 {

  @Override
  public Z triangleElement(final int n, final int k) {
    return super.triangleElement(n, k).add(super.triangleElement(n, n - k));
  }
}
