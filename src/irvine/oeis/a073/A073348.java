package irvine.oeis.a073;

import irvine.math.function.Functions;
import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A073348 Least k such that sigma(k)/k &gt;= sigma(n)/n.
 * @author Sean A. Irvine
 */
public class A073348 extends Sequence1 {

  private long mN = 0;

  @Override
  public Z next() {
    final Z s = Functions.SIGMA1.z(++mN);
    long k = 0;
    while (true) {
      ++k;
      if (s.multiply(k).compareTo(Functions.SIGMA1.z(k).multiply(mN)) <= 0) {
        return Z.valueOf(k);
      }
    }
  }
}

