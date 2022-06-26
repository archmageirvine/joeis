package irvine.oeis.a057;

import irvine.factor.factor.Jaguar;
import irvine.factor.util.FactorSequence;
import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A057714 If (p_k)^(c_k) is highest power of p_k dividing n (where p_k is a prime dividing n and p_k &gt; p_j for all k &gt; j), then (p_k)^(c_k) &gt; (p_j)^(c_j) for all k &gt; j.
 * @author Sean A. Irvine
 */
public class A057714 implements Sequence {

  private long mN = 5;

  private boolean is(final FactorSequence fs) {
    final Z[] p = fs.toZArray();
    if (p.length <= 1) {
      return false;
    }
    Z t = p[0].pow(fs.getExponent(p[0]));
    for (int k = 1; k < p.length; ++k) {
      final Z s = p[k].pow(fs.getExponent(p[k]));
      if (s.compareTo(t) <= 0) {
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
