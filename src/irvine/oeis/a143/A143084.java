package irvine.oeis.a143;

import irvine.math.function.Functions;
import irvine.math.z.Z;
import irvine.oeis.triangle.Triangle;

/**
 * A143084 Triangle read by rows: T(n,m) = (n + m)!.
 * @author Georg Fischer
 */
public class A143084 extends Triangle {


  @Override
  public Z compute(final int n, final int k) {
    return Functions.FACTORIAL.z(n + k);
  }
}
