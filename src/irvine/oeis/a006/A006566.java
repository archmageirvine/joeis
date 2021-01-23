package irvine.oeis.a006;

import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A006566 Dodecahedral numbers: a(n) = n*(3*n - 1)*(3*n - 2)/2.
 * @author Sean A. Irvine
 */
public class A006566 implements Sequence {

  private long mN = -1;

  @Override
  public Z next() {
    ++mN;
    return Z.valueOf(3 * mN - 1).multiply(3 * mN - 2).multiply(mN).divide2();
  }
}
