package irvine.oeis.a274;

import irvine.math.MemoryFunction2;
import irvine.math.factorial.MemoryFactorial;
import irvine.math.q.Q;
import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A274447.
 * @author Sean A. Irvine
 */
public class A274447 extends MemoryFunction2<Integer, Z> implements Sequence {

  private final MemoryFactorial mF = new MemoryFactorial();
  private int mN = -1;

  // Eulerian2 function
  @Override
  protected Z compute(final Integer n, final Integer k) {
    if (k == 0) {
      return Z.ONE;
    }
    if (k.equals(n)) {
      return Z.ZERO;
    }
    return get(n - 1, k).multiply(k + 1).add(get(n - 1, k - 1).multiply(2 * n - k - 1));
  }

  @Override
  public Z next() {
    if (++mN == 0) {
      return Z.ONE;
    }
    Z s = Z.ZERO;
    for (int k = 0; k < mN; ++k) {
      final Z t = get(mN - 1, k);
      s = s.signedAdd((k & 1) == 0, t);
    }
    return new Q(s, mF.factorial(mN).shiftLeft(2 * mN - 1)).num();
  }

}
