package irvine.oeis.a064;

import irvine.factor.factor.Jaguar;
import irvine.factor.util.FactorSequence;
import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A064907 Semiprimes p1*p2 such that p2 mod p1 = 9, with p2 &gt; p1.
 * @author Sean A. Irvine
 */
public class A064907 extends Sequence1 {

  private long mN = 340;

  @Override
  public Z next() {
    while (true) {
      final FactorSequence fs = Jaguar.factor(++mN);
      if (fs.isSemiprime() == FactorSequence.YES) {
        final Z[] p = fs.toZArray();
        if (p.length == 2 && p[1].mod(p[0]).equals(Z.NINE)) {
          return Z.valueOf(mN);
        }
      }
    }
  }
}

