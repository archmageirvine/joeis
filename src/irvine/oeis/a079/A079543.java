package irvine.oeis.a079;

import irvine.factor.factor.Jaguar;
import irvine.math.z.Z;
import irvine.oeis.a002.A002808;

/**
 * A079543 Numbers n such that n has at least two distinct prime factors and if a prime p divides n then (p-1) | (n-1) and (p+1) | (n+1).
 * @author Sean A. Irvine
 */
public class A079543 extends A002808 {

  private boolean is(final Z n) {
    final Z np = n.add(1);
    final Z[] f = Jaguar.factor(n).toZArray();
    if (f.length < 2) {
      return false;
    }
    for (final Z p : f) {
      if (!np.mod(p.add(1)).isZero()) {
        return false;
      }
    }
    final Z nm = n.subtract(1);
    for (final Z p : f) {
      if (!nm.mod(p.subtract(1)).isZero()) {
        return false;
      }
    }
    return true;
  }

  @Override
  public Z next() {
    while (true) {
      final Z n = super.next();
      if (n.isOdd() && n.mod(3) != 0 && is(n)) {
        return n;
      }
    }
  }
}
