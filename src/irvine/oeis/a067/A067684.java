package irvine.oeis.a067;

import irvine.factor.factor.Jaguar;
import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A067684 Numbers n such that sigma(2n+1)=3n.
 * @author Sean A. Irvine
 */
public class A067684 extends Sequence1 {

  private long mN = 1;

  @Override
  public Z next() {
    while (true) {
      if (Jaguar.factor(2 * ++mN + 1).sigma().longValueExact() == 3 * mN) {
        return Z.valueOf(mN);
      }
    }
  }
}
