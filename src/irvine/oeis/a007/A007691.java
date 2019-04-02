package irvine.oeis.a007;

import irvine.factor.factor.Cheetah;
import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A007691 Multiply-perfect numbers: n divides sigma(n).
 * @author Sean A. Irvine
 */
public class A007691 implements Sequence {

  private long mN = 0;

  @Override
  public Z next() {
    while (true) {
      if (Cheetah.factor(++mN).sigma().mod(mN) == 0) {
        return Z.valueOf(mN);
      }
    }
  }
}
