package irvine.oeis.a061;

import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A061250 a(n) = (n-2)*(n-1)^n.
 * @author Sean A. Irvine
 */
public class A061250 extends Sequence1 {

  private long mN = 0;

  @Override
  public Z next() {
    return Z.valueOf(mN++).pow(mN).multiply(mN - 2);
  }
}
