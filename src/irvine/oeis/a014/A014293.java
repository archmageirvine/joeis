package irvine.oeis.a014;

import irvine.math.z.Z;
import irvine.oeis.Sequence0;

/**
 * A014293 a(n) = n^(n+1) - n + 1.
 * @author Sean A. Irvine
 */
public class A014293 extends Sequence0 {

  private int mN = -1;

  @Override
  public Z next() {
    return Z.valueOf(++mN).pow(mN + 1).subtract(mN - 1);
  }
}

