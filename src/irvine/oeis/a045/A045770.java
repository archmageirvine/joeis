package irvine.oeis.a045;

import irvine.factor.factor.Jaguar;
import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A045770 Numbers k such that sigma(k) == 8 (mod k).
 * @author Sean A. Irvine
 */
public class A045770 implements Sequence {

  private long mN = 0;

  @Override
  public Z next() {
    while (true) {
      if (++mN == 1 || Jaguar.factor(mN).sigma().mod(mN) == 8) {
        return Z.valueOf(mN);
      }
    }
  }
}
