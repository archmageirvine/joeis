package irvine.oeis.a056;

import irvine.math.z.Binomial;
import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A056641 Least positive integer k for which (b+1)^k is not palindromic in base b, b = 2, 3, 4, ...
 * @author Sean A. Irvine
 */
public class A056641 implements Sequence {

  private Z mA = null;
  private long mM = 0;
  private long mN = 1;

  @Override
  public Z next() {
    if (mA == null) {
      mA = Z.TWO;
      return Z.FOUR;
    }
    if (--mM <= 0) {
      mA = mA.add(1);
      mM = Binomial.binomial(++mN, (mN - 1) / 2).longValueExact();
    }
    return mA;
  }
}
