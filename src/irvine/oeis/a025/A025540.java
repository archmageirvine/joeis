package irvine.oeis.a025;

import irvine.math.z.Binomial;
import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A025540 Least common multiple of {C(0,0), C(2,1), ..., C(2n,n)}.
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
