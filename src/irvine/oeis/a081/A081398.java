package irvine.oeis.a081;

import irvine.factor.factor.Jaguar;
import irvine.math.function.Functions;
import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A081398 Numbers k for which the number of common prime factors of sigma(k) and phi(k) is exactly six (ignoring multiplicity).
 * @author Sean A. Irvine
 */
public class A081398 extends Sequence1 {

  private int mN = 2003638;

  @Override
  public Z next() {
    while (true) {
      final Z[] p = Jaguar.factor(Functions.PHI.l(++mN)).toZArray();
      if (p.length >= 6) {
        final Z[] q = Jaguar.factor(Functions.SIGMA1.z(mN)).toZArray();
        int j = 0;
        int i = 0;
        int cnt = 0;
        while (true) {
          final int c = p[j].compareTo(q[i]);
          if (c == 0) {
            if (++cnt > mN) {
              break;
            }
            ++j;
          } else if (c < 0) {
            ++j;
          } else {
            ++i;
          }
          if (j == p.length || i == q.length) {
            if (cnt == 6) {
              return Z.valueOf(mN);
            }
            break;
          }
        }
      }
    }
  }
}

