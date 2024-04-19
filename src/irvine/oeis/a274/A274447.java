package irvine.oeis.a274;

import irvine.math.function.Functions;
import irvine.math.q.Q;
import irvine.math.z.Z;
import irvine.oeis.memory.MemoryFunction2Sequence;

/**
 * A274447 Numerators in expansion of W(exp(x)) about x=1, where W is the Lambert function.
 * @author Sean A. Irvine
 */
public class A274447 extends MemoryFunction2Sequence<Integer, Z> {

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
    return get(n - 1, k).multiply(k + 1).add(get(n - 1, k - 1).multiply(2L * n - k - 1));
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
    return new Q(s, Functions.FACTORIAL.z(mN).shiftLeft(2L * mN - 1)).num();
  }

}
