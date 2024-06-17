package irvine.oeis.a034;

import irvine.math.function.Functions;
import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A034947 Jacobi (or Kronecker) symbol (-1/n).
 * @author Sean A. Irvine
 */
public class A034947 extends Sequence1 {

  private long mN = 0;

  @Override
  public Z next() {
    return Functions.KRONECKER.z(-1, ++mN);
  }
}
