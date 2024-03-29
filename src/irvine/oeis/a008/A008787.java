package irvine.oeis.a008;

import irvine.math.z.Z;
import irvine.oeis.Sequence0;

/**
 * A008787 a(n) = (n + 6)^n.
 * @author Sean A. Irvine
 */
public class A008787 extends Sequence0 {

  private int mN = -1;

  @Override
  public Z next() {
    return Z.valueOf(++mN + 6).pow(mN);
  }
}


