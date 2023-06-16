package irvine.oeis.a040;

import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A040026 If n=r*2^s, r odd, then a(n)=t*r, where t is smallest (in magnitude) number such that 1=t*r+u*2^s.
 * @author Sean A. Irvine
 */
public class A040026 extends Sequence1 {

  private long mN = 0;

  @Override
  public Z next() {
    final Z r = Z.valueOf(++mN).makeOdd();
    final Z s = Z.ONE.shiftLeft(r.auxiliary());
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
