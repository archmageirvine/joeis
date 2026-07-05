package irvine.oeis.a085;

import irvine.math.z.Z;
import irvine.oeis.Sequence2;

/**
 * A085690 Number of intersections between a sphere inscribed in a cube and the n X n X n cubes resulting from a cubic lattice subdivision of the enclosing cube.
 * @author Sean A. Irvine
 */
public class A085690 extends Sequence2 {

  // After Hugo Pfoertner, https://oeis.org/A085690/a085690_1.f.txt

  private long mR = 1;

  @Override
  public Z next() {
    ++mR;
    final long rr = mR * mR;

    long l = 0;
    long n = 0;

    for (long i = -mR; i <= mR - 2; i += 2) {
      final long ii = i * i;
      final long ipp = (i + 2) * (i + 2);

      for (long j = -mR; j <= mR - 2; j += 2) {
        final long jj = j * j;
        final long jpp = (j + 2) * (j + 2);

        for (long k = -mR; k <= mR - 2; k += 2) {
          final long kk = k * k;
          final long kpp = (k + 2) * (k + 2);

          final long d1 = ii + jj + kk - rr;
          final long d2 = ii + jpp + kk - rr;
          final long d3 = ipp + jj + kk - rr;
          final long d4 = ipp + jpp + kk - rr;
          final long d5 = ii + jj + kpp - rr;
          final long d6 = ii + jpp + kpp - rr;
          final long d7 = ipp + jj + kpp - rr;
          final long d8 = ipp + jpp + kpp - rr;

          long mi = d1;
          long ma = d1;

          if (d2 < mi) {
            mi = d2;
          }
          if (d2 > ma) {
            ma = d2;
          }
          if (d3 < mi) {
            mi = d3;
          }
          if (d3 > ma) {
            ma = d3;
          }
          if (d4 < mi) {
            mi = d4;
          }
          if (d4 > ma) {
            ma = d4;
          }
          if (d5 < mi) {
            mi = d5;
          }
          if (d5 > ma) {
            ma = d5;
          }
          if (d6 < mi) {
            mi = d6;
          }
          if (d6 > ma) {
            ma = d6;
          }
          if (d7 < mi) {
            mi = d7;
          }
          if (d7 > ma) {
            ma = d7;
          }
          if (d8 < mi) {
            mi = d8;
          }
          if (d8 > ma) {
            ma = d8;
          }

          final long prod = mi * ma;
          if (prod <= 0) {
            if (prod == 0) {
              ++n;
            } else {
              ++l;
            }
          }
        }
      }
    }
    return Z.valueOf(l + n / 2);
  }
}
