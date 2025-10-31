package irvine.oeis.a389;

import irvine.math.function.Functions;
import irvine.math.z.Z;
import irvine.oeis.Sequence0;

/**
 * A389973 a(n) is the least k such that k + sopfr(k) has exactly n prime factors, counted with multiplicity.
 * @author Sean A. Irvine
 */
public class A389973 extends Sequence0 {

  private long mN = -1;

  @Override
  public Z next() {
    ++mN;
    long k = 0;
    while (true) {
      if (Functions.BIG_OMEGA.l(Functions.SOPFR.l(++k) + k) == mN) {
        return Z.valueOf(k);
      }
    }
  }
}

