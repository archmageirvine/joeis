package irvine.oeis.a068;

import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A068532 a(n) = (5^(2^n)-1)/2^(n+2)/3.
 * @author Sean A. Irvine
 */
public class A068532 extends Sequence1 {

  private long mN = 0;

  @Override
  public Z next() {
    return Z.FIVE.pow(Z.ONE.shiftLeft(++mN)).subtract(1).divide(Z.ONE.shiftLeft(mN + 2)).divide(3);
  }
}

