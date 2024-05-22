package irvine.oeis.a065;

import irvine.math.function.Functions;
import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A065523 Numbers n such that sigma(n) is a prime power (A025475).
 * @author Sean A. Irvine
 */
public class A065523 extends Sequence1 {

  private long mN = 2;

  @Override
  public Z next() {
    while (true) {
      final Z base = Functions.SIGMA1.z(++mN).isPower();
      if (base != null && base.isProbablePrime()) {
        return Z.valueOf(mN);
      }
    }
  }
}
