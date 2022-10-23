package irvine.oeis.a007;

import irvine.math.q.Q;
import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A007237 Number of triangles with integer sides and area = n times perimeter.
 * @author Sean A. Irvine
 */
public class A007237 extends Sequence1 {

  private long mN = 0;

  @Override
  public Z next() {
    ++mN;
    long cnt = 0;
    final Z dd = Z.valueOf(mN).square().multiply(4);
    final long d = dd.longValueExact();
    final Z e = dd.multiply(3);
    final long se = e.sqrt().longValueExact();
    for (long b = 1; b <= se; ++b) {
      final long eb = e.divide(b).longValueExact();
      for (long c = 2 * mN; c <= eb; ++c) {
        if (c >= b && b * c > d) {
          final Q f = new Q(d * (b + c), b * c - d);
          if (f.isInteger() && f.toZ().longValueExact() >= c) {
            ++cnt;
          }
        }
      }
    }
    return Z.valueOf(cnt);
  }
}
