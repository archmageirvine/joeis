package irvine.oeis.a086;

import irvine.math.api.Matrix;
import irvine.math.function.Functions;
import irvine.math.group.MatrixRing;
import irvine.math.matrix.DefaultMatrix;
import irvine.math.z.Integers;
import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A086595 Number of ways to arrange the numbers 1..n in a circle (up to direction) such that every two adjacent numbers are relatively prime.
 * @author Sean A. Irvine
 */
public class A086595 extends Sequence1 {

  // After Max Alekseyev

  private long mN = 0;

  @Override
  public Z next() {
    ++mN;
    final Matrix<Z> a = new DefaultMatrix<>(mN, mN, Z.ZERO);
    for (long i = 0; i < mN; ++i) {
      for (long j = 0; j < mN; ++j) {
        a.set(i, j, Functions.GCD.l(i + 1, j + 1) == 1 ? Z.ONE : Z.ZERO);
      }
    }
    Z r = Z.ZERO;
    for (long s = 1; s < 1L << mN; s += 2) {
      final int d = Long.bitCount(s);
      final Matrix<Z> m = new DefaultMatrix<>(d, d, Z.ZERO);
      for (long k = 0, j = 0, t = s; t != 0; t >>>= 1, ++j) {
        if ((t & 1) == 1) {
          for (long l = 0, i = 0, u = s; u != 0; u >>>= 1, ++i) {
            if ((u & 1) == 1) {
              m.set(k, l++, a.get(j, i));
            }
          }
          ++k;
        }
      }
      //System.out.println(a + " " + Long.toBinaryString(s) + " " + m);
      final MatrixRing<Z> ring = new MatrixRing<>(d, Integers.SINGLETON);
      r = r.add(ring.pow(m, mN).get(0, 0).multiply(Z.NEG_ONE.pow(mN - d)));
    }
    return r;
  }
}
