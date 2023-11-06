package irvine.oeis.a066;

import irvine.factor.factor.Jaguar;
import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A066784.
 * @author Sean A. Irvine
 */
public class A066784 extends Sequence1 {

  private long mN = 0;

  @Override
  public Z next() {
    while (true) {
      if (Jaguar.factor(++mN).sigma().square().subtract(mN * mN).isSquare()) {
        return Z.valueOf(mN);
      }
    }
  }
}

