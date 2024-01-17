package irvine.oeis.a067;

import irvine.oeis.a066.A066926;

/**
 * A067952 Numbers k having a partition k = sum x_i for which sum k/x_i is also a partition of k and the x_i are distinct parts.
 * @author Sean A. Irvine
 */
public class A067952 extends A066926 {

  @Override
  protected boolean isPartitionable(final long n, final long x, final long y, final long[] terms, final int pos) {
    if (pos >= terms.length || x < 0 || y < 0) {
      return false;
    }
    if (x == 0 && y == 0) {
      return true;
    }
    if (n % terms[pos] == 0 && isPartitionable(n, x - terms[pos], y - n / terms[pos], terms, pos + 1)) {
      return true;
    }
    return isPartitionable(n, x, y, terms, pos + 1);
  }
}
