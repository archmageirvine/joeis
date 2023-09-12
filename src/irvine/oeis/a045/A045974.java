package irvine.oeis.a045;

import java.util.Map;
import java.util.TreeMap;

import irvine.factor.factor.Jaguar;
import irvine.factor.prime.Puma;
import irvine.factor.util.FactorSequence;
import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A045974 If m = p_i^e_i, n=Product p_j^f_j, set G_m(n) = Product p_{j+i}^{f_j*e_i}; extend G_m to all m by multiplicativity; sequence gives a(n)=G_n(n).
 * @author Sean A. Irvine
 */
public class A045974 extends Sequence1 {

  private final Map<Z, Integer> mInverseP = new TreeMap<>();
  private long mN = 0;

  private int inverseP(final Z p) {
    final Integer v = mInverseP.get(p);
    if (v != null) {
      return v;
    }
    // We can assume we will see novel primes in order
    final int n = mInverseP.size() + 1;
    mInverseP.put(p, n);
    return n;
  }

  @Override
  public Z next() {
    ++mN;
    Z prod = Z.ONE;
    final FactorSequence fs = Jaguar.factor(mN);
    for (final Z p : fs.toZArray()) {
      final int e = fs.getExponent(p);
      final int i = inverseP(p);
      for (final Z q : fs.toZArray()) {
        prod = prod.multiply(Puma.primeZ(i + inverseP(q)).pow((long) e * fs.getExponent(q)));
      }
    }
    return prod;
  }
}
