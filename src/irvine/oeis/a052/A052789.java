package irvine.oeis.a052;

import irvine.math.z.Z;
import irvine.oeis.Sequence0;

/**
 * A052789 Expansion of e.g.f. -(1/5)*LambertW(-5*x).
 * @author Sean A. Irvine
 */
public class A052789 extends Sequence0 {

  private int mN = -1;

  @Override
  public Z next() {
    return Z.valueOf(5L * ++mN).pow(mN - 1);
  }
}
