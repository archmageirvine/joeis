package irvine.oeis.a070;

import irvine.math.function.Functions;
import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A070982 Smallest integer k such that n divides sigma(k).
 * @author Sean A. Irvine
 */
public class A070982 extends Sequence1 {

  private long mN = 0;

  @Override
  public Z next() {
    ++mN;
    long t = 0;
    while (true) {
      if (Functions.SIGMA1.l(++t) % mN == 0) {
        return Z.valueOf(t);
      }
    }
  }
}
