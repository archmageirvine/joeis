package irvine.oeis.a111;

import irvine.math.z.Z;
import irvine.oeis.a144.A144150;

/**
 * A111672 Array T(n,k) = A153277(n-1,k) = A144150(n,k-1) read by downwards antidiagonals.
 * @author Georg Fischer
 */
public class A111672 extends A144150 {

  {
    setOffset(1);
  }

  @Override
  public Z matrixElement(final int n, final int k) {
    return super.matrixElement(n + 1, k);
  }
}
