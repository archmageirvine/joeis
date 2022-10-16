package irvine.oeis.a059;

import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A059976 Number of 3 X 3 determinants with elements from {0,...,n} and having the value zero.
 * @author Sean A. Irvine
 */
public class A059976 implements Sequence {

  private long mN = -1;

  // abc
  // def
  // ghi

  @Override
  public Z next() {
    ++mN;
    long cnt = 0;
    for (long a = 0; a <= mN; ++a) {
      for (long e = 0; e <= mN; ++e) {
        for (long i = 0; i <= mN; ++i) {
          final long s = a * e * i;
          for (long f = 0; f <= mN; ++f) {
            for (long h = 0; h <= mN; ++h) {
              final long t = s - a * f * h;
              for (long b = 0; b <= mN; ++b) {
                for (long d = 0; d <= mN; ++d) {
                  final long u = t - b * d * i;
                  for (long g = 0; g <= mN; ++g) {
                    final long v = u + b * f * g;
                    for (long c = 0; c <= mN; ++c) {
                      if (v + c * d * h - c * e * g == 0) {
                        ++cnt;
                      }
                    }
                  }
                }
              }
            }
          }
        }
      }
    }
    return Z.valueOf(cnt);
  }
}
