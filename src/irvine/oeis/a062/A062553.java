package irvine.oeis.a062;

import irvine.factor.factor.Jaguar;
import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A062501.
 * @author Sean A. Irvine
 */
public class A062553 extends Sequence1 {

  private long mN = 0;

  @Override
  public Z next() {
    final Z sigma0 = Jaguar.factor(++mN).sigma0();
    return sigma0.add((mN & 1) == 1 ? mN : 3 * mN / 2);
  }
}

