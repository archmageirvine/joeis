package irvine.oeis.a076;

import irvine.math.function.Functions;
import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A076251 Numbers m such that omega(m) = omega(m-1) + omega(m-2), where omega(m) is the number of distinct prime factors of m.
 * @author Sean A. Irvine
 */
public class A076251 extends Sequence1 {

  private long mN = 2;

  @Override
  public Z next() {
    while (true) {
      if (Functions.OMEGA.i(++mN) == Functions.OMEGA.i(mN - 1) + Functions.OMEGA.i(mN - 2)) {
        return Z.valueOf(mN);
      }
    }
  }
}
