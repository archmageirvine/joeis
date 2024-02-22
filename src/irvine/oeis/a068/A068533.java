package irvine.oeis.a068;

import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A068533 a(n) = (11^(2^n)-1)/2^(n+2)/15.
 * @author Sean A. Irvine
 */
public class A068533 extends Sequence1 {

  private static final Z Z11 = Z.valueOf(11);
  private long mN = 0;

  @Override
  public Z next() {
    return Z11.pow(Z.ONE.shiftLeft(++mN)).subtract(1).divide(Z.ONE.shiftLeft(mN + 2)).divide(15);
  }
}

