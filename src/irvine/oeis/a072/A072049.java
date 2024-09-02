package irvine.oeis.a072;

import irvine.math.cr.CR;
import irvine.math.q.Q;
import irvine.math.z.Z;
import irvine.oeis.a000.A000040;

/**
 * A072049 a(n) = floor(2^(n/(floor(n*log(2)/log(prime(n)))))).
 * @author Sean A. Irvine
 */
public class A072049 extends A000040 {

  private long mN = 0;

  @Override
  public Z next() {
    final CR logp = CR.valueOf(super.next()).log();
    final Q exp = new Q(++mN, CR.LOG2.multiply(mN).divide(logp).floor());
    return CR.TWO.pow(exp).floor();
  }
}

