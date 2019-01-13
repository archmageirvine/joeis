package irvine.oeis.a137;

import irvine.math.LongUtils;
import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A137450.
 * @author Sean A. Irvine
 */
public class A137450 implements Sequence {

  private long mN = 0;
  @Override
  public Z next() {
    ++mN;

    // compute lcm of coprime values
    Z lcm = Z.ONE;
    for (long k = 2; k < mN; ++k) {
      if (LongUtils.gcd(k, mN) == 1) {
        lcm = lcm.lcm(Z.valueOf(k));
      }
    }

    // Find the lcm'th term that is coprime
    // This could be done better ...
    final long l = lcm.longValueExact();
    long q = 0;
    long c = 1;
    while (true) {
      if (l == ++q) {
        return Z.valueOf(c);
      }
      if (LongUtils.gcd(mN, q) == 1) {
        ++c;
      }
    }
  }

}

