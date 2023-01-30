package irvine.oeis.a061;

import irvine.math.z.Carmichael;
import irvine.math.z.Integers;
import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A061258 a(n)=Sum_{d|n} d*psi(d), where psi(d) is reduced totient function, cf. A002322.
 * @author Sean A. Irvine
 */
public class A061258 extends Sequence1 {

  private int mN = 0;

  @Override
  public Z next() {
    return Integers.SINGLETON.sumdiv(++mN, d -> Carmichael.lambda(d).multiply(d));
  }
}
