package irvine.oeis.a053;

import java.util.Arrays;

/**
 * A053171 Number of 3 X 3 integer matrices with elements in the range [ -n,n ] which represent a rotation of order 2.
 * @author Sean A. Irvine
 */
public class A053171 extends A053170 {

  @Override
  protected boolean is(final int[] m) {
    final int det = det(m);
    if (det != 1) {
      return false;
    }
    if (Arrays.equals(IDENTITY, m)) {
      return false;
    }
    final int[] u = new int[9];
    multiply(u, m, m);
    return Arrays.equals(IDENTITY, u);
  }
}
