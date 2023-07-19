package irvine.oeis.a064;

import irvine.factor.factor.Jaguar;
import irvine.factor.util.FactorSequence;
import irvine.math.z.Z;
import irvine.oeis.Sequence0;

/**
 * A064596 Smallest nonunitary multiperfect number of index n; i.e., smallest k such that sigma(k) - usigma(k) = nk.
 * @author Sean A. Irvine
 */
public class A064596 extends Sequence0 {

  private long mN = -1;

  @Override
  public Z next() {
    ++mN;
    long m = 0;
    while (true) {
      final FactorSequence fs = Jaguar.factor(++m);
      final Z t = fs.sigma().subtract(fs.unitarySigma());
      if (t.longValueExact() == m * mN) {
        return Z.valueOf(m);
      }
    }
  }
}

