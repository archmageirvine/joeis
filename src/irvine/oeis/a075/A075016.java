package irvine.oeis.a075;

import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A053188.
 * @author Sean A. Irvine
 */
public class A075016 extends Sequence1 {

  private long mN = 0;

  @Override
  public Z next() {
    ++mN;
    long k = 1;
    while (true) {
      if (new Z(new StringBuilder().append(++k).append(k - 1).append(k - 2)).mod(mN) == 0) {
        return Z.valueOf(k);
      }
    }
  }
}

