package irvine.oeis.a067;

import irvine.factor.factor.Jaguar;
import irvine.math.cr.CR;
import irvine.math.z.Z;
import irvine.oeis.a000.A000040;

/**
 * A067235.
 * @author Sean A. Irvine
 */
public class A067253 extends A000040 {

  private long mN = 1;
  {
    super.next();
  }

  @Override
  public Z next() {
    while (true) {
      if (super.next().equals(CR.valueOf(Jaguar.factor(Jaguar.factor(++mN).sigma()).omega() * mN).log().multiply(mN).floor())) {
        return Z.valueOf(mN);
      }
    }
  }
}

