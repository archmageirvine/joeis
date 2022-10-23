package irvine.oeis.a008;

import irvine.math.z.Z;
import irvine.oeis.Sequence0;

/**
 * A008786 a(n) = (n+5)^n.
 * @author Sean A. Irvine
 */
public class A008786 extends Sequence0 {

  private int mN = -1;

  @Override
  public Z next() {
    return Z.valueOf(++mN + 5).pow(mN);
  }
}


