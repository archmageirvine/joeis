package irvine.oeis.a033;

import irvine.factor.factor.Cheetah;
import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A033942 Positive integers with at least 3 prime factors (counted with multiplicity).
 * @author Sean A. Irvine
 */
public class A033942 implements Sequence {

  private long mN = 7;

  @Override
  public Z next() {
    while (true) {
      if (Cheetah.factor(++mN).bigOmega() >= 3) {
        return Z.valueOf(mN);
      }
    }
  }
}
