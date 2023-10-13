package irvine.oeis.a048;

import java.util.Arrays;

import irvine.math.q.Q;
import irvine.math.z.Z;
import irvine.oeis.a051.A051626;

/**
 * A048997 Sum of digits in decimal expansion of 1/n up to the point where it repeats for the first time.
 * @author Sean A. Irvine
 */
public class A048997 extends A051626 {

  @Override
  public Z next() {
    long res = 0;
    final Z period = super.next();
    if (period.isZero()) {
      // Terminating decimal
      Q t = new Q(Z.ONE, mN);
      do {
        final long f = t.floor().longValueExact();
        res += f;
        t = t.subtract(f);
        t = t.multiply(10);
      } while (!t.isZero());
    } else {
      final int[] a = new int[period.intValueExact()];
      final int[] b = new int[a.length];
      Q n = new Q(Z.ONE, mN);
      for (int k = 0; k < a.length; ++k) {
        n = n.multiply(10);
        a[k] = n.toZ().intValue();
        n = n.subtract(a[k]);
      }
      for (int k = 0; k < b.length; ++k) {
        n = n.multiply(10);
        b[k] = n.toZ().intValue();
        n = n.subtract(b[k]);
      }
      // Skip over any preperiod
      while (!Arrays.equals(a, b)) {
        res += a[0];
        System.arraycopy(a, 1, a, 0, a.length - 1);
        a[a.length - 1] = b[0];
        System.arraycopy(b, 1, b, 0, b.length - 1);
        n = n.multiply(10);
        b[b.length - 1] = n.toZ().intValue();
        n = n.subtract(b[b.length - 1]);
      }
      for (final int digit : a) {
        res += digit;
      }
    }
    return Z.valueOf(res);
  }
}
