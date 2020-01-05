package irvine.oeis.a028;

import irvine.math.MemoryFunction2;
import irvine.math.factorial.MemoryFactorial;
import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A028338 Triangle of coefficients in expansion of <code>(x+1)*(x+3)*...*(x + 2n - 1)</code> in rising powers of <code>x</code>.
 * @author Sean A. Irvine
 */
public class A028338 extends MemoryFunction2<Integer, Z> implements Sequence {

  private static final MemoryFactorial mF = new MemoryFactorial();
  private int mN = -1;
  private int mM = 0;

  @Override
  protected Z compute(final Integer n, final Integer m) {
    if (n.equals(m)) {
      return Z.ONE;
    }
    if (m == 0) {
      return mF.doubleFactorial(2 * n - 1);
    }
    return get(n - 1, m).multiply(2L * n - 1).add(get(n - 1, m - 1));
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
