package irvine.oeis.a065;

import java.util.Arrays;

import irvine.factor.factor.Jaguar;
import irvine.factor.util.FactorSequence;
import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A065642 a(1) = 1; for n &gt; 1, a(n) = Min {m &gt; n | m has same prime factors as n ignoring multiplicity}.
 * @author Sean A. Irvine
 */
public class A065642 extends Sequence1 {

  private long mN = 0;

  @Override
  public Z next() {
    if (++mN == 1) {
      return Z.ONE;
    }
    final FactorSequence fs = Jaguar.factor(mN);
    if (fs.omega() == 1) {
      // Handle prime powers directly, n=p^k -> p^(k+1)
      // This is only for efficiency
      return fs.toZArray()[0].multiply(mN);
    }
    final Z[] target = fs.toZArray();
    long k = mN;
    while (true) {
      if (Arrays.equals(Jaguar.factor(++k).toZArray(), target)) {
        return Z.valueOf(k);
      }
    }
  }
}
