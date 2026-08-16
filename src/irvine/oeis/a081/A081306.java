package irvine.oeis.a081;

import irvine.math.function.Functions;
import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A081306 Numbers k with prime factors less than 2*lpf(k), where lpf(k) is the least prime factor of k (A020639).
 * @author Sean A. Irvine
 */
public class A081306 extends Sequence1 {

  private long mN = 0;

  @Override
  public Z next() {
    while (true) {
      if (Functions.LPF.l(++mN) * 2 > Functions.GPF.l(mN)) {
        return Z.valueOf(mN);
      }
    }
  }
}

