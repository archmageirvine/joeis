package irvine.oeis.a002;

import irvine.math.z.Z;
import irvine.oeis.Sequence;
import java.util.HashMap;
import irvine.util.Pair;

/**
 * A002573.
 * @author Sean A. Irvine
 */
public class A002573 implements Sequence {

  private int mN = 0;
  private final HashMap<Pair<Long, Long>, Z> mV = new HashMap<>();

  private Z v(final long c, final long d) {
    if (c < 0 || d < 0) {
      return Z.ZERO;
    }
    if (d == c) {
      return Z.ONE;
    }
    final Pair<Long, Long> key = new Pair<>(c, d);
    final Z res = mV.get(key);
    if (res != null) {
      return res;
    }
    Z sum = Z.ZERO;
    for (long k = 1; k <= 2 * c; ++k) {
      sum = sum.add(v(k, d - c));
    }
    mV.put(key, sum);
    return sum;
  }

  protected int firstPart() {
    return 2;
  }

  @Override
  public Z next() {
    return v(firstPart(), ++mN);
  }

}
