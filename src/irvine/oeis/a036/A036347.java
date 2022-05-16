package irvine.oeis.a036;

import irvine.factor.factor.Jaguar;
import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A036347 Parity of n and its sum of prime factors differs (counted with multiplicity).
 * @author Sean A. Irvine
 */
public class A036347 implements Sequence {

  private long mN = 5;

  @Override
  public Z next() {
    while (true) {
      final Z sum = Jaguar.factor(++mN).sopfr();
      if ((mN & 1) != (sum.longValue() & 1)) {
        return Z.valueOf(mN);
      }
    }
  }
}
