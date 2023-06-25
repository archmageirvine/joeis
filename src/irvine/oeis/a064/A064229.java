package irvine.oeis.a064;

import irvine.factor.factor.Jaguar;
import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A064229 Smallest prime p associated with A064164(n).
 * @author Sean A. Irvine
 */
public class A064229 extends Sequence1 {

  private Z mF = Z.ONE;
  private long mN = 1;

  @Override
  public Z next() {
    while (true) {
      mF = mF.multiply(++mN);
      for (final Z p : Jaguar.factor(mF.add(1)).toZArray()) {
        if (p.mod(mN) != 1) {
          return p;
        }
      }
    }
  }
}

