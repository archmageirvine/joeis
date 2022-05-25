package irvine.oeis.a027;

import irvine.factor.factor.Jaguar;
import irvine.factor.util.FactorSequence;
import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A027855 Antimutinous numbers: n&gt;1 such that n/p^k &lt; p, where p is the largest prime dividing n and p^k is the highest power of p dividing n.
 * @author Sean A. Irvine
 */
public class A027855 implements Sequence {

  private long mN = 1;

  @Override
  public Z next() {
    while (true) {
      final FactorSequence fs = Jaguar.factor(++mN);
      final Z lpf = fs.largestPrimeFactor();
      final long pe = lpf.pow(fs.getExponent(lpf)).longValue();
      if (mN / pe < lpf.longValue()) {
        return Z.valueOf(mN);
      }
    }
  }
}
