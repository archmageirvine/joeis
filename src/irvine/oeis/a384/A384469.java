package irvine.oeis.a384;

import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A384469 a(n) is the number of triples 1 &lt;= A, B, C &lt;= n such that the discriminant D = B^2 - 4*A*C of the polynomial A*x^2 + B*x + C is 0.
 * @author Sean A. Irvine
 */
public class A384469 extends Sequence1 {

  private long mN = 0;

  @Override
  public Z next() {
    ++mN;
    long cnt = 0;
    for (long b = 1; b <= mN; ++b) {
      final long b2 = b * b;
      for (long a = 1; a <= mN; ++a) {
        for (long c = 1; c < a; ++c) {
          if (b2 - 4 * a * c == 0) {
            cnt += 2;
          }
        }
        if (b2 - 4 * a * a == 0) {
          ++cnt;
        }
      }
    }
    return Z.valueOf(cnt);
  }
}

