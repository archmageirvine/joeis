package irvine.oeis.a025;

import irvine.math.z.Binomial;
import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A025540.
 * @author Sean A. Irvine
 */
public class A025540 implements Sequence {

  private long mN = -1;
  private Z mL = Z.ONE;

  @Override
  public Z next() {
    mL = mL.lcm(Binomial.binomial(2 * ++mN, mN));
    return mL;
  }
}
