package irvine.oeis.a070;

import irvine.math.function.Functions;
import irvine.math.z.Z;
import irvine.oeis.a000.A000040;

/**
 * A070521 Value of prime(n)-th cyclotomic polynomial at n.
 * @author Sean A. Irvine
 */
public class A070521 extends A000040 {

  private long mN = 0;

  @Override
  public Z next() {
    return Functions.CYCLOTOMIC.z(super.next(), ++mN);
  }
}
