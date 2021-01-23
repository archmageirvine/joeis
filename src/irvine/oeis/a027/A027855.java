package irvine.oeis.a027;

import irvine.factor.factor.Cheetah;
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
      final FactorSequence fs = Cheetah.factor(++mN);
      final Z[] p = fs.toZArray();
      final Z lpf = p[p.length - 1];
      final long pe = lpf.pow(fs.getExponent(lpf)).longValue();
      if (mN / pe < lpf.longValue()) {
        return Z.valueOf(mN);
      }
    }
  }
}
