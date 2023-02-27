package irvine.oeis.a061;

import irvine.math.cr.CR;
import irvine.math.q.Q;
import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A061565 Floor( product_{k = 1..n} k^(1/k) ).
 * @author Sean A. Irvine
 */
public class A061565 extends Sequence1 {

  private long mN = 0;
  private CR mProduct = CR.ONE;

  @Override
  public Z next() {
    mProduct = mProduct.multiply(CR.valueOf(++mN).pow(new Q(1, mN)));
    return mProduct.floor();
  }
}

