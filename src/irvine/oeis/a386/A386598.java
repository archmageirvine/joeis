package irvine.oeis.a386;

import irvine.math.function.Functions;
import irvine.math.z.Z;
import irvine.oeis.Sequence0;

/**
 * A386598 a(n) is the least k such that k - sopfr(k) has exactly n prime factors, counted with multiplicity.
 * @author Sean A. Irvine
 */
public class A386598 extends Sequence0 {

  private long mN = -1;

  @Override
  public Z next() {
    ++mN;
    long k = 0;
    while (true) {
      if (Functions.BIG_OMEGA.l(++k - Functions.SOPFR.l(k)) == mN) {
        return Z.valueOf(k);
      }
    }
  }
}

