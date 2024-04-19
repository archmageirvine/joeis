package irvine.oeis.a061;

import irvine.math.MemoryFunction3;
import irvine.math.function.Functions;
import irvine.math.z.Integers;
import irvine.math.z.Z;
import irvine.oeis.Sequence2;

/**
 * A061889 a(n) = number of solutions to x_1 + x_2 + ... + x_n = x_{n+1} where each x_i is a factorial.
 * @author Sean A. Irvine
 */
public class A061889 extends Sequence2 {

  private int mN = 1;
  private final MemoryFunction3<Z, Z> mB = new MemoryFunction3<>() {
    @Override
    protected Z compute(final Z n, final Z k, final Z m) {
      if (n.equals(k)) {
        return Z.ONE;
      }
      if (m.compareTo(Z.ONE) <= 0 || n.compareTo(k) < 0) {
        return Z.ZERO;
      }
      final Z mf = Functions.FACTORIAL.z(m);
      if (n.compareTo(mf.multiply(k)) > 0) {
        return Z.ZERO;
      }
      return get(n, k, m.subtract(1)).add(get(n.subtract(mf), k.subtract(1), m));
    }
  };

  @Override
  public Z next() {
    final Z n = Z.valueOf(++mN);
    return Integers.SINGLETON.sum(2, mN, r -> {
      return mB.get(Functions.FACTORIAL.z(r), n, Z.valueOf(r - 1));
    });
  }
}
