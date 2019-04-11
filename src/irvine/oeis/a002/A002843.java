package irvine.oeis.a002;

import irvine.math.z.Z;
import irvine.util.Point;
import irvine.oeis.Sequence;

import java.util.HashMap;

/**
 * A002843 Number of partitions of n into parts <code>1/2, 3/4, 7/8, 15/16,</code> etc.
 * @author Sean A. Irvine
 */
public class A002843 implements Sequence {

  private int mN = -1;
  private final HashMap<Point, Z> mV = new HashMap<>();

  private Z v(final int c, final int d) {
    if (d < 0 || c < 0) {
      return Z.ZERO;
    }
    if (d == c) {
      return Z.ONE;
    }
    final Point key = new Point(c, d);
    final Z res = mV.get(key);
    if (res != null) {
      return res;
    }
    Z sum = Z.ZERO;
    for (int k = 1; k <= 2 * c; ++k) {
      sum = sum.add(v(k, d - c));
    }
    mV.put(key, sum);
    return sum;
  }

  @Override
  public Z next() {
    if (++mN == 0) {
      return Z.ONE;
    }
    Z sum = Z.ZERO;
    for (int d = 1; d <= mN; ++d) {
      sum = sum.add(v(d, mN));
    }
    return sum;
  }
}
