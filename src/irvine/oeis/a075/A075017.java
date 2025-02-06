package irvine.oeis.a075;

import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A075017 Smallest k such that the concatenation k, k+1,k+2,k+3 is divisible by n; or 0 if no such number exists.
 * @author Sean A. Irvine
 */
public class A075017 extends Sequence1 {

  private long mN = 0;

  @Override
  public Z next() {
    ++mN;
    long k = 0;
    while (true) {
      if (new Z(new StringBuilder().append(++k).append(k + 1).append(k + 2).append(k + 3)).mod(mN) == 0) {
        return Z.valueOf(k);
      }
    }
  }
}

