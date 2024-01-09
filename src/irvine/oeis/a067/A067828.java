package irvine.oeis.a067;

import irvine.factor.factor.Jaguar;
import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A067828 Odd numbers k such that sigma(k+1) &lt; sigma(k).
 * @author Sean A. Irvine
 */
public class A067828 extends Sequence1 {

  private long mN = 43;

  @Override
  public Z next() {
    while (true) {
      mN += 2;
      if (Jaguar.factor(mN + 1).sigma().compareTo(Jaguar.factor(mN).sigma()) < 0) {
        return Z.valueOf(mN);
      }
    }
  }
}
