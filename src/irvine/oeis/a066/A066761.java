package irvine.oeis.a066;

import irvine.factor.factor.Jaguar;
import irvine.factor.util.FactorSequence;
import irvine.math.z.Z;
import irvine.oeis.Sequence2;

/**
 * A066761 Number of positive integers of the form (n^2+k^2)/(n-k) for k=1,2,3,4,....,n-1.
 * @author Sean A. Irvine
 */
public class A066761 extends Sequence2 {

  private long mN = 1;

  @Override
  public Z next() {
    long cnt = 0;
    final FactorSequence fs = Jaguar.factor(++mN).square();
    fs.add(Z.TWO, FactorSequence.PRIME);
    for (final Z d : fs.divisors()) {
      if (d.longValueExact() < mN) {
        ++cnt;
      }
    }
    return Z.valueOf(cnt);
  }
}

