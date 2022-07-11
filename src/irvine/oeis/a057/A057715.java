package irvine.oeis.a057;

import irvine.factor.factor.Jaguar;
import irvine.factor.util.FactorSequence;
import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A057715 Composite numbers m = Product p_i^{e_i} such that p_j^{e_j} &gt; p_k^{e_k} for all p_j &lt; p_k.
 * @author Sean A. Irvine
 */
public class A057715 implements Sequence {

  private long mN = 11;

  private boolean is(final FactorSequence fs) {
    final Z[] p = fs.toZArray();
    if (p.length <= 1) {
      return false;
    }
    Z t = p[0].pow(fs.getExponent(p[0]));
    for (int k = 1; k < p.length; ++k) {
      final Z s = p[k].pow(fs.getExponent(p[k]));
      if (s.compareTo(t) >= 0) {
        return false;
      }
      t = s;
    }
    return true;
  }

  @Override
  public Z next() {
    while (true) {
      final FactorSequence fs = Jaguar.factor(++mN);
      if (is(fs)) {
        return Z.valueOf(mN);
      }
    }
  }
}
