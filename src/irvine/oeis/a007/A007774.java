package irvine.oeis.a007;

import irvine.factor.factor.Cheetah;
import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A007774.
 * @author Sean A. Irvine
 */
public class A007774 implements Sequence {

  private long mN = 5;

  @Override
  public Z next() {
    while (true) {
      if (Cheetah.factor(++mN).toZArray().length == 2) {
        return Z.valueOf(mN);
      }
    }
  }
}
