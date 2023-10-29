package irvine.oeis.a023;

import irvine.math.z.Z;
import irvine.oeis.Sequence0;

/**
 * A023037 a(n) = n^0 + n^1 + ... + n^(n-1), or a(n) = (n^n-1)/(n-1) with a(0)=0; a(1)=1.
 * @author Sean A. Irvine
 */
public class A023037 extends Sequence0 {

  private int mN = -1;

  @Override
  public Z next() {
    return ++mN < 2 ? Z.valueOf(mN) : Z.valueOf(mN).pow(mN).subtract(1).divide(mN - 1);
  }
}
