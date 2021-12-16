package irvine.oeis.a053;

import java.util.Arrays;

/**
 * A053172 Number of 3 X 3 integer matrices with elements in the range [ -n,n ] which represent a three-fold rotation.
 * @author Sean A. Irvine
 */
public class A053172 extends A053170 {

  @Override
  protected boolean is(final int[] m) {
    final int det = det(m);
    if (det != 1 && det != -1) {
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
      if (++k > 2) {
        return false;
      }
    }
    return k == 2;
  }
}
