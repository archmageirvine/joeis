package irvine.oeis.a053;

import irvine.factor.factor.Jaguar;
import irvine.factor.util.FactorSequence;
import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A053585 If n = p_1^e_1 * ... * p_k^e_k, p_1 &lt; ... &lt; p_k primes, then a(n) = p_k^e_k.
 * @author Sean A. Irvine
 */
public class A053585 implements Sequence {

  private long mN = 0;

  @Override
  public Z next() {
    final FactorSequence fs = Jaguar.factor(++mN);
    final Z[] p = fs.toZArray();
    return p.length == 0 ? Z.ONE : p[p.length - 1].pow(fs.getExponent(p[p.length - 1]));
  }
}
