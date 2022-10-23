package irvine.oeis.a008;

import irvine.math.z.Z;
import irvine.oeis.Sequence0;

/**
 * A008789 a(n) = n^(n+3).
 * @author Sean A. Irvine
 */
public class A008789 extends Sequence0 {

  private int mN = -1;

  @Override
  public Z next() {
    return Z.valueOf(++mN).pow(mN + 3);
  }
}


