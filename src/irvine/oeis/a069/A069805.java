package irvine.oeis.a069;

import irvine.math.function.Functions;
import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A069805 Smallest k&gt;n such that tau(n) divides tau(k)=A000005(k).
 * @author Sean A. Irvine
 */
public class A069805 extends Sequence1 {

  private long mN = 0;

  @Override
  public Z next() {
    final Z sigma0 = Functions.SIGMA0.z(++mN);
    long k = mN;
    while (true) {
      if (Functions.SIGMA0.z(++k).mod(sigma0).isZero()) {
        return Z.valueOf(k);
      }
    }
  }
}

