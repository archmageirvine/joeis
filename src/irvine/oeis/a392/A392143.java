package irvine.oeis.a392;

import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A392143 a(n) = (n^(n - 1) - 1)^n.
 * @author Sean A. Irvine
 */
public class A392143 extends Sequence1 {

  private long mN = 0;

  @Override
  public Z next() {
    return Z.valueOf(++mN).pow(mN - 1).subtract(1).pow(mN);
  }
}
