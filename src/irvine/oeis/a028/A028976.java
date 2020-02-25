package irvine.oeis.a028;

import irvine.math.LongUtils;
import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A028976 Theta series of <code>8-d 5-modular</code> lattice <code>Q_8(1)</code> with det 625 and minimal norm 4.
 * @author Sean A. Irvine
 */
public class A028976 implements Sequence {

  // Works but very slow, O(n^8)

  //2*(2*a^2-2*a*b+a*c+a*d-a*e-2*a*f+2*a*h+2*b^2-b*c-b*e+b*f+b*g-b*h+2*c^2-c*d+c*e-2*c*f-2*c*g+2*d^2+d*e+d*f+2*d*g+d*h+2*e^2+e*f-e*g-2*e*h+2*f^2+2*f*g+2*g^2+g*h+2*h^2)

  private long mN = -1;

  @Override
  public Z next() {
    if (++mN == 0) {
      return Z.ONE;
    }
    long cnt = 0;
    final long lim = mN;
    for (long a = -lim; a <= lim; ++a) {
      final long t0 = 2 * a * a;
      for (long b = -lim; b <= lim; ++b) {
        final long t1 = t0 - 2 * a * b + 2 * b * b;
        for (long c = -lim; c <= lim; ++c) {
          final long t2 = t1 + a * c - b * c + 2 * c * c;
          for (long d = -lim; d <= lim; ++d) {
            final long t3 = t2 + a * d - c * d + 2 * d * d;
            for (long e = -lim; e <= lim; ++e) {
              final long t4 = t3 - a * e - b * e + c * e + d * e + 2 * e * e;
              for (long f = -lim; f <= lim; ++f) {
                final long t5 = t4 - 2 * a * f + b * f - 2 * c * f + d * f + e * f + 2 * f * f;
                for (long g = -lim; g <= lim; ++g) {
                  final long t6 = t5 + b * g - 2 * c * g + 2 * d * g - e * g + 2 * f * g + 2 * g * g;
                  for (long h = -lim; h <= lim; ++h) {
                    if (t6 + 2 * a * h - b * h + d * h -2 * e * h + g * h + 2 * h * h == mN) {
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
    return Z.valueOf(cnt);
  }
}
