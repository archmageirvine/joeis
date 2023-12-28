package irvine.oeis.a067;

import irvine.factor.factor.Jaguar;
import irvine.factor.util.FactorSequence;
import irvine.math.cr.CR;
import irvine.math.q.Q;
import irvine.math.z.Z;
import irvine.oeis.Sequence2;

/**
 * A067631 If n is composite then a(n) is the standard deviation of the prime factors of n, rounded off to the nearest integer (rounding up if there's a choice), with each factor counted according to its frequency of occurrence in the prime factorization. If n is 1 or prime then a(n)=0.
 * @author Sean A. Irvine
 */
public class A067631 extends Sequence2 {

  private long mN = 1;

  @Override
  public Z next() {
    final FactorSequence fs = Jaguar.factor(++mN);
    Z s = Z.ZERO;
    long c = 0;
    for (final Z p : fs.toZArray()) {
      final int e = fs.getExponent(p);
      s = s.add(p.multiply(e));
      c += e;
    }
    if (c == 1) {
      return Z.ZERO;
    }
    final Q mu = new Q(s).divide(c);
    Q t = Q.ZERO;
    for (final Z p : fs.toZArray()) {
      final int e = fs.getExponent(p);
      t = t.add(mu.subtract(p).square().multiply(e));
    }
    return CR.valueOf(t.divide(c - 1)).sqrt().round();
  }
}
