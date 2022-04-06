package irvine.oeis.a055;

import irvine.math.z.Z;
import irvine.oeis.a000.A000142;

/**
 * A055774 Least common multiple of n! and n^n.
 * @author Sean A. Irvine
 */
public class A055774 extends A000142 {

  {
    super.next();
  }

  @Override
  public Z next() {
    return super.next().lcm(Z.valueOf(mN).pow(mN));
  }
}
