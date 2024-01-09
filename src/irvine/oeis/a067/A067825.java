package irvine.oeis.a067;

import irvine.factor.factor.Jaguar;
import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A067825 Even values of n such that sigma(n + 1) &gt; sigma(n).
 * @author Sean A. Irvine
 */
public class A067825 extends Sequence1 {

  private long mN = 0;

  @Override
  public Z next() {
    while (true) {
      mN += 2;
      if (Jaguar.factor(mN + 1).sigma().compareTo(Jaguar.factor(mN).sigma()) > 0) {
        return Z.valueOf(mN);
      }
    }
  }
}
