package irvine.oeis.a058;

import irvine.math.LongUtils;
import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A058656 a(n) = gcd(n+1, phi(n)).
 * @author Sean A. Irvine
 */
public class A058656 implements Sequence {

  private long mN = 0;

  @Override
  public Z next() {
    return Z.valueOf(LongUtils.gcd(++mN + 1, LongUtils.phi(mN)));
  }
}
