package irvine.oeis.a069;

import irvine.math.function.Functions;
import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A069789 Smallest k&gt;n such that sigma(n) divides sigma(k).
 * @author Sean A. Irvine
 */
public class A069789 extends Sequence1 {

  private long mN = 0;

  @Override
  public Z next() {
    final Z sigma = Functions.SIGMA1.z(++mN);
    long k = mN;
    while (true) {
      if (Functions.SIGMA.z(++k).mod(sigma).isZero()) {
        return Z.valueOf(k);
      }
    }
  }
}

