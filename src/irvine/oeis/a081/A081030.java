package irvine.oeis.a081;

import irvine.math.function.Functions;
import irvine.math.z.Z;
import irvine.oeis.Conjectural;
import irvine.oeis.Sequence1;

/**
 * A081030 a(n) = largest k such that (sum of digits of k^n) &gt;= k.
 * @author Sean A. Irvine
 */
public class A081030 extends Sequence1 implements Conjectural {

  private static final long HEURISTIC = 2;
  private long mN = 0;

  @Override
  public Z next() {
    ++mN;
    long k = 0;
    long max = 0;
    while (true) {
      if (Functions.DIGIT_SUM.l(Z.valueOf(++k).pow(mN)) >= k) {
        max = k;
      }
      if (k > HEURISTIC * max) {
        return Z.valueOf(max);
      }
    }
  }
}
