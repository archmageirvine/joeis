package irvine.oeis.a063;

import irvine.factor.factor.Jaguar;
import irvine.factor.util.FactorSequence;
import irvine.math.function.Functions;
import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A063935 q(n) = sigma(n) - n, where q(n) = n + e(n) + e(n-e(n)) and e(n) = n - eulerphi(n).
 * @author Sean A. Irvine
 */
public class A063935 extends Sequence1 {

  private long mN = 299;

  @Override
  public Z next() {
    while (true) {
      final FactorSequence fs = Jaguar.factor(++mN);
      final Z q = fs.sigma().subtract(mN);
      final Z p = fs.phi();
      final Z e = Z.valueOf(mN).subtract(p);
      final Z r = p.subtract(Functions.PHI.z(p));
      if (q.equals(r.add(e).add(mN))) {
        return Z.valueOf(mN);
      }
    }
  }
}
