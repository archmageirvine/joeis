package irvine.oeis.a055;

import irvine.math.LongUtils;
import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A055483 a(n) is the GCD of n and the reverse of n.
 * @author Sean A. Irvine
 */
public class A055483 implements Sequence {

  private long mN = 0;

  @Override
  public Z next() {
    return Z.valueOf(LongUtils.gcd(++mN, LongUtils.reverse(mN)));
  }
}
