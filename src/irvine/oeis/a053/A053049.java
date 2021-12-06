package irvine.oeis.a053;

import irvine.math.LongUtils;
import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A053049 Smallest integer m such that sum_(k=1 to m) phi(k) is divisible by n, where phi(k) is the totient function.
 * @author Sean A. Irvine
 */
public class A053049 implements Sequence {

  private long mN = 0;

  @Override
  public Z next() {
    ++mN;
    long m = 0;
    long sum = 0;
    do {
      sum += LongUtils.phi(++m);
      sum %= mN;
    } while (sum != 0);
    return Z.valueOf(m);
  }
}
