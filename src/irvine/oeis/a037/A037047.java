package irvine.oeis.a037;

import irvine.math.z.Z;
import irvine.math.z.ZUtils;
import irvine.oeis.Sequence;

/**
 * A037047 Starting at n, "say what you see"; sequence gives number of primes obtained before first composite number appears.
 * @author Sean A. Irvine
 */
public class A037047 implements Sequence {

  private Z mN = Z.ZERO;

  @Override
  public Z next() {
    mN = mN.add(1);
    Z s = ZUtils.describe(mN);
    long count = 0;
    while (s.isProbablePrime()) {
      s = ZUtils.describe(s);
      ++count;
    }
    return Z.valueOf(count);
  }
}
