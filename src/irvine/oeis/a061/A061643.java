package irvine.oeis.a061;

import irvine.math.cr.CR;
import irvine.math.q.Q;
import irvine.math.z.Z;
import irvine.oeis.Sequence2;

/**
 * A061643 First n digits after the decimal point in the n-th root of n.
 * @author Sean A. Irvine
 */
public class A061643 extends Sequence2 {

  private long mN = 1;

  @Override
  public Z next() {
    return CR.valueOf(++mN).pow(new Q(1, mN)).frac().multiply(Z.TEN.pow(mN)).floor();
  }
}

