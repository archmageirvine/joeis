package irvine.oeis.a074;

import irvine.math.function.Functions;
import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A074756 Least s &gt; n such that tau(n!) divides tau(s!).
 * @author Sean A. Irvine
 */
public class A074756 extends Sequence1 {

  private long mN = 0;

  @Override
  public Z next() {
    final Z sigma0 = Functions.SIGMA0.z(Functions.FACTORIAL.z(++mN));
    long k = mN;
    while (true) {
      if (Functions.SIGMA0.z(Functions.FACTORIAL.z(++k)).mod(sigma0).isZero()) {
        return Z.valueOf(k);
      }
    }
  }
}
