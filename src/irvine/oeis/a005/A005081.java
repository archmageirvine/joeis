package irvine.oeis.a005;

import irvine.factor.factor.Cheetah;
import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A005081.
 * @author Sean A. Irvine
 */
public class A005081 implements Sequence {

  private long mN = 0;

  @Override
  public Z next() {
    Z s = Z.ZERO;
    for (final Z p : Cheetah.factor(++mN).toZArray()) {
      if (p.mod(4) == 1 && !Z.ONE.equals(p)) {
        s = s.add(p.pow(4));
      }
    }
    return s;
  }
}

