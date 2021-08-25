package irvine.oeis.a051;

import irvine.factor.factor.Cheetah;
import irvine.factor.util.FactorSequence;
import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A051119 n/p^k, where p = largest prime dividing n and p^k = highest power of p dividing n.
 * @author Sean A. Irvine
 */
public class A051119 implements Sequence {

  private long mN = 0;

  @Override
  public Z next() {
    if (++mN == 1) {
      return Z.ONE;
    }
    final FactorSequence fs = Cheetah.factor(mN);
    final Z[] p = fs.toZArray();
    return Z.valueOf(mN).divide(p[p.length - 1].pow(fs.getExponent(p[p.length - 1])));
  }
}
