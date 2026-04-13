package irvine.oeis.a084;

import irvine.math.MemoryFunction2;
import irvine.math.function.Functions;
import irvine.math.z.Z;
import irvine.oeis.Sequence0;

/**
 * A084422 Number of subsets of integers 1 through n (including the empty set) containing no pair of integers that share a common factor.
 * @author Sean A. Irvine
 */
public class A084422 extends Sequence0 {

  // After Charles R Greathouse IV

  private int mN = -1;
  private final MemoryFunction2<Z, Z> mB = new MemoryFunction2<>() {
    @Override
    protected Z compute(final Z n, final Z m) {
      if (n.isZero()) {
        return Z.ONE;
      }
      if (n.isOne()) {
        return Z.TWO;
      }
      final Z t = get(n.subtract(1), m);
      return Functions.GCD.z(n, m).isOne() ? t.add(get(n.subtract(1), n.multiply(m))) : t;
    }
  };

  @Override
  public Z next() {
    return mB.get(Z.valueOf(++mN), Z.ONE);
  }
}
