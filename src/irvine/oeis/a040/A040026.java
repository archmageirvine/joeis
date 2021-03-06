package irvine.oeis.a040;

import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A040026.
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
