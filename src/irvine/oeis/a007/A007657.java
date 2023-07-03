package irvine.oeis.a007;

import irvine.math.MemoryFunction2;
import irvine.oeis.memory.MemoryFunction2Sequence;
import irvine.math.z.Binomial;
import irvine.math.z.Z;

/**
 * A007657 Maximal coefficient in (x + x^2 + x^4 + x^8 + ...)^n.
 * @author Sean A. Irvine
 */
public class A007657 extends MemoryFunction2Sequence<Integer, Z> {

  // M function from Giorgilli and Molteni,
  // "Representation of a 2-power as sum of k 2-powers: A recursive formula"
  // Note this is essentially A007178
  private static class MFunction extends MemoryFunction2<Integer, Z> {

    @Override
    protected Z compute(final Integer k, final Integer l) {
      if (l >= k) {
        return Z.ZERO;
      }
      if (k > 1 && l == k - 1) {
        return Z.ONE;
      }
      Z sum = Z.ZERO;
      for (int s = 1; s <= 2 * l; ++s) {
        sum = sum.add(Binomial.binomial(k + l - 1, 2L * l - s).multiply(get(k - l, s)));
      }
      return sum;
    }
  }

  private final MFunction mM = new MFunction();
  private int mN = 0;

  // W function
  @Override
  protected Z compute(final Integer sigma, final Integer k) {
    if (sigma == 1) {
      return k == 1 ? Z.ONE : mM.get(k, 1);
    }
    Z sum = Z.ZERO;
    for (int n = 1; n < k; ++n) {
      sum = sum.add(Binomial.binomial(k, n).multiply(get(1, n)).multiply(get(sigma - 1, k - n)));
    }
    return sum;
  }

  @Override
  public Z next() {
    ++mN;
    int sigma = 1;
    Z res = get(sigma, mN);
    while (true) {
      final Z t = get(++sigma, mN);
      if (t.compareTo(res) < 0) {
        return res;
      }
      res = t;
    }
  }
}
