package irvine.oeis.a081;

import irvine.factor.factor.Jaguar;
import irvine.math.function.Functions;
import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A081383 Least x = a(n) such that number of common prime factors (ignoring multiplicity) of sigma(x) = A000203(x) and phi(x) = A000010(x) equals n.
 * @author Sean A. Irvine
 */
public class A081383 extends Sequence1 {

  private int mN = 0;

  @Override
  public Z next() {
    ++mN;
    long k = 1;
    while (true) {
      final Z[] p = Jaguar.factor(Functions.PHI.l(++k)).toZArray();
      if (p.length >= mN) {
        final Z[] q = Jaguar.factor(Functions.SIGMA1.z(k)).toZArray();
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
            if (cnt == mN) {
              return Z.valueOf(k);
            }
            break;
          }
        }
      }
    }
  }
}

