package irvine.oeis.a016;

import irvine.math.function.Functions;
import irvine.math.z.Z;
import irvine.oeis.Sequence0;

/**
 * A016727 Number of inequivalent solutions to x^2+y^2+z^2 = n^2.
 * @author Sean A. Irvine
 */
public class A016727 extends Sequence0 {

  // Cf. A000164.

  private long mN = -1;

  @Override
  public Z next() {
    long c = 0;
    final long s = ++mN * mN;
    for (long i = 0; i <= mN; ++i) {
      final long is = i * i;
      final long jlim = Functions.SQRT.l(s - is);
      for (long j = i; j <= jlim; ++j) {
        final long js = is + j * j;
        final long rs = s - js;
        final long r = Functions.SQRT.l(rs);
        if (r >= j && r * r == rs) {
          ++c;
        }
      }
    }
    return Z.valueOf(c);
  }
}

