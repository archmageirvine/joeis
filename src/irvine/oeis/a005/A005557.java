package irvine.oeis.a005;

import irvine.math.z.Binomial;
import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A005557.
 * @author Sean A. Irvine
 */
public class A005557 implements Sequence {

  private long mN = -1;

  @Override
  public Z next() {
    ++mN;
    return Binomial.binomial(mN + 10, 4).multiply(mN + 1).divide(5);
  }
}
