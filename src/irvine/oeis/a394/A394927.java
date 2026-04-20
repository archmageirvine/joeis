package irvine.oeis.a394;

import irvine.math.function.Functions;
import irvine.math.z.Z;
import irvine.oeis.a003.A003056;

/**
 * A394927 a(n) is the minimal sum of squares over partitions of n into distinct parts.
 * @author Sean A. Irvine
 */
public class A394927 extends A003056 {

  private long mN = -1;

  @Override
  public Z next() {
    ++mN;
    final Z k = super.next();
    final Z t = Functions.TRIANGULAR.z(k);
    return Functions.PYRAMIDAL.z(k).add(Z.valueOf(mN).subtract(t).multiply(k.multiply2().add(2 - mN).add(t)));
  }
}
