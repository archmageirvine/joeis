package irvine.oeis.a057;

import irvine.factor.factor.Jaguar;
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
      mA = Jaguar.factor(++mN + 1).phi();
      if (t.mod(mA).isZero()) {
        return Z.valueOf(mN);
      }
    }
  }
}

