package irvine.oeis.a067;

import irvine.factor.factor.Jaguar;
import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A067685 Numbers n such that sigma(4n+1)=6n.
 * @author Sean A. Irvine
 */
public class A067685 extends Sequence1 {

  private long mN = 0;

  @Override
  public Z next() {
    while (true) {
      if (Jaguar.factor(4 * ++mN + 1).sigma().longValueExact() == 6 * mN) {
        return Z.valueOf(mN);
      }
    }
  }
}
