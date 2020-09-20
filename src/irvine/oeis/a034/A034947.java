package irvine.oeis.a034;

import irvine.math.LongUtils;
import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A034947 Jacobi (or Kronecker) symbol (-1/n).
 * @author Sean A. Irvine
 */
public class A034947 implements Sequence {

  private long mN = 0;

  @Override
  public Z next() {
    return Z.valueOf(LongUtils.kronecker(-1, ++mN));
  }
}
