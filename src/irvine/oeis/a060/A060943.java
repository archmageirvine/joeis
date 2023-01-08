package irvine.oeis.a060;

import irvine.math.z.Integers;
import irvine.math.z.Z;
import irvine.oeis.a036.A036740;

/**
 * A060943 a(n) = n!^n * Sum_{k=1..n} 1/k^n.
 * @author Sean A. Irvine
 */
public class A060943 extends A036740 {

  {
    super.next();
    setOffset(1);
  }

  @Override
  public Z next() {
    final Z t = super.next();
    return Integers.SINGLETON.sum(1, mN, k -> t.divide(Z.valueOf(k).pow(mN)));
  }
}
