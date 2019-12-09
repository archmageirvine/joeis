package irvine.oeis.a027;

import irvine.factor.factor.Cheetah;
import irvine.factor.util.FactorSequence;
import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A027854 Mutinous numbers: <code>n&gt;1</code> such that <code>n/p^k &gt</code>; p, where p is the largest prime dividing n and <code>p^k</code> is the highest power of p dividing <code>n</code>.
 * @author Sean A. Irvine
 */
public class A027854 implements Sequence {

  private long mN = 11;

  @Override
  public Z next() {
    while (true) {
      final FactorSequence fs = Cheetah.factor(++mN);
      final Z[] p = fs.toZArray();
      final Z lpf = p[p.length - 1];
      final long pe = lpf.pow(fs.getExponent(lpf)).longValue();
      if (mN / pe > lpf.longValue()) {
        return Z.valueOf(mN);
      }
    }
  }
}
