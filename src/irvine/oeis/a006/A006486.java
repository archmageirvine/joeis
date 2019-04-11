package irvine.oeis.a006;

import irvine.factor.factor.Jaguar;
import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A006486 <code>a(n) =</code> largest prime factor of <code>n^n - 1</code>.
 * @author Sean A. Irvine
 */
public class A006486 implements Sequence {

  private int mN = 1;

  @Override
  public Z next() {
    ++mN;
    Z max = Z.ONE;
    for (final Z p : Jaguar.factor(Z.valueOf(mN).pow(mN).subtract(1)).toZArray()) {
      max = max.max(p);
    }
    return max;
  }
}

