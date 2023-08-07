package irvine.oeis.a064;

import irvine.factor.factor.Jaguar;
import irvine.factor.util.FactorSequence;
import irvine.math.z.Z;
import irvine.oeis.Sequence0;

/**
 * A064910 Smallest semiprime p1*p2 such that p2 &gt;= p1 and p2 mod p1 = n.
 * @author Sean A. Irvine
 */
public class A064910 extends Sequence0 {

  private long mN = -1;

  @Override
  public Z next() {
    if (++mN == 0) {
      return Z.FOUR;
    }
    final Z n = Z.valueOf(mN);
    long m = 5;
    while (true) {
      final FactorSequence fs = Jaguar.factor(++m);
      if (fs.isSemiprime() == FactorSequence.YES) {
        final Z[] p = fs.toZArray();
        if (p.length == 2 && p[1].mod(p[0]).equals(n)) {
          return Z.valueOf(m);
        }
      }
    }
  }
}

