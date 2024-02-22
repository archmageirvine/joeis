package irvine.oeis.a068;

import irvine.math.z.Z;
import irvine.oeis.Sequence2;

/**
 * A068534 a(n)=(7^(2^n)-1)/2^(n+2)/150.
 * @author Sean A. Irvine
 */
public class A068534 extends Sequence2 {

  private long mN = 1;

  @Override
  public Z next() {
    return Z.SEVEN.pow(Z.ONE.shiftLeft(++mN)).subtract(1).divide(Z.ONE.shiftLeft(mN + 2)).divide(150);
  }
}

