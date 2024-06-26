package irvine.oeis.a065;

import irvine.math.function.Functions;
import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A065925 Smallest k such that sopf(n+k) = sopf(k), where sopf = A008472.
 * @author Sean A. Irvine
 */
public class A065925 extends Sequence1 {

  private long mN = 0;

  @Override
  public Z next() {
    ++mN;
    long k = 0;
    while (true) {
      if (Functions.SOPF.z(++k).equals(Functions.SOPF.z(mN + k))) {
        return Z.valueOf(k);
      }
    }
  }
}
