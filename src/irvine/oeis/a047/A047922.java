package irvine.oeis.a047;

import irvine.math.factorial.MemoryFactorial;
import irvine.math.z.Z;
import irvine.oeis.memory.MemoryFunction2Sequence;

/**
 * A047922 Triangle of numbers a(n,k) = number of terms in n X n determinant with 2 adjacent diagonals of k and k-1 0's (0&lt;=k&lt;=n).
 * @author Sean A. Irvine
 */
public class A047922 extends MemoryFunction2Sequence<Integer, Z> {

  // After Alois P. Heinz

  private final MemoryFactorial mF = MemoryFactorial.SINGLETON;
  private int mN = -1;
  private int mM = 0;

  @Override
  protected Z compute(final Integer n, final Integer m) {
    if (m == 0) {
      return mF.factorial(n);
    }
    if (n.equals(m)) {
      return n < 3
        ? Z.valueOf((long) (n - 1) * (n - 2) / 2)
        : get(n - 1, n - 1).add(get(n - 2, n - 2)).multiply(n - 1).add(get(n - 3, n - 3));
    } else {
      return get(n, m + 1).add(get(n - 1, m).multiply2()).add(get(n - 2, m - 1));
    }
  }

  @Override
  public Z next() {
    if (++mM > mN) {
      ++mN;
      mM = 0;
    }
    return get(mN, mM);
  }
}
