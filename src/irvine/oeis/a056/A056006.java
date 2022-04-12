package irvine.oeis.a056;

import irvine.factor.factor.Cheetah;
import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A056006 Numbers n such that n | sigma(n) + 2.
 * @author Sean A. Irvine
 */
public class A056006 implements Sequence {

  private long mN = 0;

  @Override
  public Z next() {
    while (true) {
      if (Cheetah.factor(++mN).sigma().add(2).mod(mN) == 0) {
        return Z.valueOf(mN);
      }
    }
  }
}
