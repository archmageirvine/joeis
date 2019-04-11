package irvine.oeis.a002;

import irvine.math.z.Z;
import irvine.oeis.Sequence;
import irvine.oeis.a100.A100640;

/**
 * A002176 <code>a(n) =</code> LCM of denominators of Cotesian numbers {C(n,k), <code>0 &lt;=</code> k <code>&lt;= n}</code>.
 * @author Sean A. Irvine
 */
public class A002176 implements Sequence {

  protected int mN = 0;

  @Override
  public Z next() {
    ++mN;
    Z s = Z.ONE;
    for (int k = 0; k <= mN; ++k) {
      s = s.lcm(A100640.cotesian(mN, k).den());
    }
    return s;
  }
}
