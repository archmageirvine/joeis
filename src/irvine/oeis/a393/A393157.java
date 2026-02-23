package irvine.oeis.a393;

import irvine.math.LongUtils;
import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A393157 Smallest positive number m such that A000538(m) is divisible by n.
 * @author Sean A. Irvine
 */
public class A393157 extends Sequence1 {

  private long mN = 0;

  @Override
  public Z next() {
    ++mN;
    long s = 0;
    long k = 0;
    while (true) {
      s += LongUtils.modPow(++k, 4, mN);
      s %= mN;
      if (s == 0) {
        return Z.valueOf(k);
      }
    }
  }
}

