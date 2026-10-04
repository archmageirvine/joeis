package irvine.oeis.a393;

import irvine.math.z.Z;
import irvine.oeis.Sequence0;

/**
 * A393855 Sum of the distinct entries in the central row and central column of the (2*n + 1) X (2*n + 1) square array formed by the integers 1, 2, ..., (2*n + 1)^2 in order.
 * @author Sean A. Irvine
 */
public class A393855 extends Sequence0 {

  private long mN = -1;

  @Override
  public Z next() {
    return Z.valueOf(4 * ++mN + 1).multiply(2 * mN * mN + 2 * mN + 1);
  }
}
