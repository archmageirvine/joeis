package irvine.oeis.a073;

import irvine.math.function.Functions;
import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A073805 Numbers k such that 1 + k*R(k) is prime, where R(k) is the reverse of k.
 * @author Sean A. Irvine
 */
public class A073805 extends Sequence1 {

  private long mN = 0;

  @Override
  public Z next() {
    while (true) {
      if (Z.valueOf(++mN).multiply(Functions.REVERSE.l(mN)).add(1).isProbablePrime()) {
        return Z.valueOf(mN);
      }
    }
  }
}
