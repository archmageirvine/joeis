package irvine.oeis.a053;

import java.util.Arrays;

/**
 * A053174 Number of 3 X 3 integer matrices with elements in the range [ -n,n ] which represent a six-fold rotation. Also the sequence for the corresponding six-fold rotoinversions.
 * @author Sean A. Irvine
 */
public class A053174 extends A053170 {

  @Override
  protected boolean is(final int[] m) {
    final int det = det(m);
    if (det != 1) {
      return false;
    }
    int[] u = new int[9];
    int[] t = Arrays.copyOf(m, m.length);
    int k = 0;
    while (!Arrays.equals(IDENTITY, t)) {
      multiply(u, t, m);
      final int[] v = t;
      t = u;
      u = v;
      if (++k > 5) {
        return false;
      }
    }
    return k == 5;
  }
}
