package irvine.oeis.a057;

import java.util.TreeSet;

import irvine.math.LongUtils;
import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A057228 a(n) = u * v = x * y with (u - v) = (x + y) = A009000(n) (u&gt;v, y&gt;0, v&gt;0, x&gt;0, y&gt;0).
 * @author Sean A. Irvine
 */
public class A057228 implements Sequence {

  private long mN = 4;
  private final TreeSet<Z> mA = new TreeSet<>();

  @Override
  public Z next() {
    while (mA.isEmpty()) {
      final long c2 = ++mN * mN;
      long a2;
      for (long a = 1; (a2 = a * a) <= c2 / 2; ++a) {
        final long b2 = c2 - a2;
        final long b = LongUtils.sqrt(b2);
        if (b * b == b2) {
          mA.add(Z.valueOf(a).multiply(b).divide2());
        }
      }
    }
    return mA.pollFirst();
  }
}
