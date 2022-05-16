package irvine.oeis.a055;

import irvine.factor.factor.Jaguar;
import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A055720 Numbers k such that d(k)+1 | k.
 * @author Sean A. Irvine
 */
public class A055720 implements Sequence {

  private long mN = 2;

  @Override
  public Z next() {
    while (true) {
      final Z n = Z.valueOf(++mN);
      if (n.mod(Jaguar.factor(n).sigma0().add(1)).isZero()) {
        return n;
      }
    }
  }
}
