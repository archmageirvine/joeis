package irvine.oeis.a027;

import irvine.math.z.Binomial;
import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A027306 a(n) = 2^(n-1) + ((1 + (-1)^n)/4)*binomial(n, n/2).
 * @author Sean A. Irvine
 */
public class A027306 implements Sequence {

  private int mN = -1;

  @Override
  public Z next() {
    if (++mN == 0) {
      return Z.ONE;
    }
    if ((mN & 1) == 0) {
      return Z.ONE.shiftLeft(mN - 1).add(Binomial.binomial(mN, mN / 2).divide2());
    } else {
      return Z.ONE.shiftLeft(mN - 1);
    }
  }
}
