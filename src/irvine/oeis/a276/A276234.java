package irvine.oeis.a276;

import irvine.math.LongUtils;
import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A276234 a(n) = n/gcd(n, 256).
 * @author Georg Fischer
 */
public class A276234 extends Sequence1 {

  private long mN = 0;

  @Override
  public Z next() {
    ++mN;
    return Z.valueOf(mN / LongUtils.gcd(mN, 256));
  }
}
