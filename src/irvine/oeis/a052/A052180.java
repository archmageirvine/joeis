package irvine.oeis.a052;

import irvine.math.function.Functions;
import irvine.math.z.Z;
import irvine.oeis.a065.A065091;

/**
 * A052180 Last filtering prime for n-th prime p: find smallest prime factor of each of the composite numbers between p and next prime; take maximal value.
 * @author Sean A. Irvine
 */
public class A052180 extends A065091 {

  {
    setOffset(2);
  }

  private Z mP = super.next();

  @Override
  public Z next() {
    Z s = mP.add(1);
    mP = super.next();
    Z max = Z.ONE;
    while (!s.equals(mP)) {
      max = max.max(Functions.LPF.z(s));
      s = s.add(1);
    }
    return max;
  }
}
