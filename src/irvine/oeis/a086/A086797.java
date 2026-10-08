package irvine.oeis.a086;

import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A086797 Discriminant of the polynomial x^n - x - 1.
 * @author Sean A. Irvine
 */
public class A086797 extends Sequence1 {

  private long mN = 0;

  @Override
  public Z next() {
    return Z.valueOf(++mN).pow(mN).signedAdd((mN & 1) == 0, Z.valueOf(mN - 1).pow(mN - 1)).multiply(Z.NEG_ONE.pow(1 + (mN + 1) / 2));
  }
}

