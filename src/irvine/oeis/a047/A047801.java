package irvine.oeis.a047;

import java.util.TreeSet;

import irvine.math.z.Z;
import irvine.oeis.Sequence0;

/**
 * A047801 Number of different values of i^2+j^2+k^2+l^2 for i,j,k,l in [ 0,n ].
 * @author Sean A. Irvine
 */
public class A047801 extends Sequence0 {

  private final TreeSet<Long> mA = new TreeSet<>();
  private long mN = -1;

  @Override
  public Z next() {
    final long s = ++mN * mN;
    for (long l = 0; l <= mN; ++l) {
      final long t = s + l * l;
      for (long k = l; k <= mN; ++k) {
        final long u = t + k * k;
        for (long j = k; j <= mN; ++j) {
          mA.add(u + j * j);
        }
      }
    }
    return Z.valueOf(mA.size());
  }
}
