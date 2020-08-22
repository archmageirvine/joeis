package irvine.oeis.a028;

import java.util.HashSet;

import irvine.math.z.Z;
import irvine.oeis.Sequence;
import irvine.util.Triple;

/**
 * A028419 Congruence classes of triangles which can be drawn using lattice points in n X n grid as vertices.
 * @author Sean A. Irvine
 */
public class A028419 implements Sequence {

  // After Martin Renner

  private long mN = -1;

  private Triple<Long> create(final long a, final long b, final long c) {
    if (a > b) {
      if (a > c) {
        return b > c ? new Triple<>(a, b, c) : new Triple<>(a, c, b);
      } else {
        return new Triple<>(c, a, b);
      }
    } else if (a > c) {
      return new Triple<>(b, a, c);
    } else {
      return b > c ? new Triple<>(b, c, a) : new Triple<>(c, b, a);
    }
  }

  @Override
  public Z next() {
    ++mN;
    final HashSet<Triple<Long>> mTriangles = new HashSet<>();
    for (long i = 0; i <= mN; ++i) {
      final long i2 = i * i;
      for (long j = i; j <= mN; ++j) {
        final long a = i2 + j * j;
        for (long k = 0; k <= mN; ++k) {
          final long k2 = k * k;
          final long ik2 = (i - k) * (i - k);
          for (long l = 0; l <= mN; ++l) {
            final long b = k2 + l * l;
            final long c = ik2 + (j - l) * (j - l);
            if (a * a + b * b + c * c != 2 * (a * b + b * c + c * a)) {
              mTriangles.add(create(a, b, c));
            }
          }
        }
      }
    }
    return Z.valueOf(mTriangles.size());
  }
}
