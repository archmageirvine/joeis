package irvine.oeis.a036;

import java.util.Arrays;

import irvine.math.q.Q;
import irvine.math.z.Z;
import irvine.oeis.a051.A051626;

/**
 * A036275 The periodic part of the decimal expansion of 1/n. Any initial 0's are to be placed at end of cycle.
 * @author Sean A. Irvine
 */
public class A036275 extends A051626 {

  private static final int[] ZERO = {0};

  // Also needed for A048962
  protected int[] step() {
    final Z period = super.next();
    if (period.isZero()) {
      return ZERO;
    }
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
    while (!Arrays.equals(a, b) || a[0] == 0) {
      System.arraycopy(a, 1, a, 0, a.length - 1);
      a[a.length - 1] = b[0];
      System.arraycopy(b, 1, b, 0, b.length - 1);
      n = n.multiply(10);
      b[b.length - 1] = n.toZ().intValue();
      n = n.subtract(b[b.length - 1]);
    }
    return a;
  }

  @Override
  public Z next() {
    final int[] a = step();
    if (a.length > 1) {
      // Now only problem is leading 0s
      while (a[0] == 0) {
        System.arraycopy(a, 1, a, 0, a.length - 1);
        a[a.length - 1] = 0;
      }
    }
    Z res = Z.ZERO;
    for (final int digit : a) {
      res = res.multiply(10).add(digit);
    }
    return res;
  }
}

