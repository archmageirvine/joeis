package irvine.oeis.a040;

import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A040026 If n=r*2^s, r odd, then a(n)=t*r, where t is smallest (in magnitude) number such that 1=t*r+u*2^s.
 * @author Sean A. Irvine
 */
public class A040026 implements Sequence {

  private long mN = 0;

  @Override
  public Z next() {
    Z r = Z.valueOf(++mN).makeOdd();
    Z s = Z.ONE.shiftLeft((int) r.auxiliary());
    long t = 0;
    while (true) {
      ++t;
      if (r.multiply(t).subtract(1).mod(s).isZero()) {
        return r.multiply(t);
      }
      if (r.multiply(t).add(1).mod(s).isZero()) {
        return r.multiply(-t);
      }
    }
  }
}
