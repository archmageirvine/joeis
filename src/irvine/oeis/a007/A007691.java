package irvine.oeis.a007;

import irvine.math.function.Functions;
import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A007691 Multiply-perfect numbers: n divides sigma(n).
 * @author Sean A. Irvine
 */
public class A007691 extends Sequence1 {

  private long mN = 0;

  @Override
  public Z next() {
    while (true) {
      if (Functions.SIGMA1.z(++mN).mod(mN) == 0) {
        return Z.valueOf(mN);
      }
    }
  }
}
