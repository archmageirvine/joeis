package irvine.oeis.a030;

import java.util.TreeSet;

import irvine.math.z.Z;

/**
 * A030058 Least non-sum of divisors of n for some n &gt;= 1.
 * @author Sean A. Irvine
 */
public class A030058 extends A030057 {

  private final TreeSet<Long> mQ = new TreeSet<>();

  @Override
  public Z next() {
    while (mQ.isEmpty() || mQ.first() > mN) {
      final long t = super.next().longValueExact();
      if (t > mN) {
        mQ.add(t);
      }
    }
    return Z.valueOf(mQ.pollFirst());
  }
}
