package irvine.oeis.a032;

import irvine.math.MemoryFunction2;
import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A032308 Expansion of <code>Product_{k&gt;=1} (1 + 3*x^k)</code>.
 * @author Sean A. Irvine
 */
public class A032308 extends MemoryFunction2<Long, Z> implements Sequence {

  // After Alois P. Heinz

  private long mN = -1;

  @Override
  protected Z compute(final Long n, final Long m) {
    if (m * (m + 1) / 2 < n) {
      return Z.ZERO;
    }
    if (n == 0) {
      return Z.ONE;
    }
    final Z b = get(n, m - 1);
    return m > n ? b : b.add(get(n - m, m - 1).multiply(3));
  }

  @Override
  public Z next() {
    return get(++mN, mN);
  }
}
