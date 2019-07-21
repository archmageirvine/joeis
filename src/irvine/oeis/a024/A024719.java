package irvine.oeis.a024;

import irvine.math.z.Binomial;
import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A024719.
 * @author Sean A. Irvine
 */
public class A024719 implements Sequence {

  private Z mSum = Z.TWO;
  private long mN = -1;

  @Override
  public Z next() {
    mSum = mSum.add(Binomial.binomial(3 * ++mN, mN));
    return mSum.divide(3);
  }
}
