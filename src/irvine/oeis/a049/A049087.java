package irvine.oeis.a049;

import irvine.factor.factor.Jaguar;
import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A049087 Ceiling of mean distance between successive distinct prime divisors of n.
 * @author Sean A. Irvine
 */
public class A049087 implements Sequence {

  private long mN = 0;

  @Override
  public Z next() {
    final Z[] p = Jaguar.factor(++mN).toZArray();
    if (p.length <= 1) {
      return Z.ZERO;
    }
    Z s = Z.ZERO;
    for (int k = 1; k < p.length; ++k) {
      s = s.add(p[k].subtract(p[k - 1]));
    }
    return s.add(p.length - 2).divide(p.length - 1);
  }
}
