package irvine.oeis.a057;

import irvine.math.z.Euler;
import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A057920 Numbers k such that phi(k+1) divides phi(k), where phi is A000010.
 * @author Sean A. Irvine
 */
public class A057920 extends Sequence1 {

  private Z mA = Z.ONE;
  private long mN = 0;

  @Override
  public Z next() {
    while (true) {
      final Z t = mA;
      mA = Euler.phi(++mN + 1);
      if (t.mod(mA).isZero()) {
        return Z.valueOf(mN);
      }
    }
  }
}

