package irvine.oeis.a045;

import irvine.factor.factor.Jaguar;
import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A045768 Numbers k such that sigma(k) == 2 (mod k).
 * @author Sean A. Irvine
 */
public class A045768 implements Sequence {

  private long mN = 0;

  @Override
  public Z next() {
    while (true) {
      if (++mN == 1 || Jaguar.factor(mN).sigma().mod(mN) == 2) {
        return Z.valueOf(mN);
      }
    }
  }
}
