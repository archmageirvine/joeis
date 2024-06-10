package irvine.oeis.a070;

import irvine.math.function.Functions;
import irvine.math.z.Z;
import irvine.oeis.a000.A000040;

/**
 * A070522 Value of n-th cyclotomic polynomial at the n-th prime.
 * @author Sean A. Irvine
 */
public class A070522 extends A000040 {

  private long mN = 0;

  @Override
  public Z next() {
    return Functions.CYCLOTOMIC.z(++mN, super.next());
  }
}
