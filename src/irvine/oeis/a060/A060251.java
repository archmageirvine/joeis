package irvine.oeis.a060;

import irvine.math.q.Q;
import irvine.math.z.Z;
import irvine.oeis.a000.A000040;

/**
 * A060251 a(n) = periodic part of decimal expansion of n/n-th prime (leading 0's moved to end).
 * @author Sean A. Irvine
 */
public class A060251 extends A000040 {

  private long mN = 0;

  @Override
  public Z next() {
    final Q q = new Q(++mN, super.next().longValueExact());
    Z t = Z.ONE;
    while (true) {
      t = t.multiply(10);
      final Q r = q.multiply(t);
      Z a = r.toZ();
      final Q b = r.subtract(a);
      if (Q.ZERO.equals(b)) {
        return Z.ZERO; // non-repeating
      }
      if (new Q(a, t.subtract(1)).equals(q)) {
        // Deal with any implicit leading 0s
        final Z u = t.divide(10);
        while (a.compareTo(u) < 0) {
          a = a.multiply(10);
        }
        return a;
      }
    }
  }
}
