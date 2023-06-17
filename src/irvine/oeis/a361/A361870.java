package irvine.oeis.a361;

import irvine.math.MemoryFunctionInt2;
import irvine.math.cr.CR;
import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A361870 Array read by antidiagonals: A(n,k) is the number of nonequivalent 2-colorings of the cells of an n-dimensional hypercube with edges k cells long under action of symmetry.
 * @author Sean A. Irvine
 */
public class A361870 extends Sequence1 {

  private static final CR C = CR.THREE.log().divide(CR.LOG2);
  private int mN = 0;
  private int mM = 0;
  private int mL = 0;

  private int rowLength(final int n) {
    return n == 1 ? 1 : C.multiply(n + 3).floor().intValueExact() - (n + 3);
  }

  private final MemoryFunctionInt2<Z> mB = new MemoryFunctionInt2<Z>() {
    @Override
    protected Z compute(final int n, final int m) {
      if (n == 1) {
        return m == 1 ? Z.ONE : Z.ZERO;
      }
      if (m <= 0 || m > rowLength(n)) {
        return Z.ZERO;
      }
      return get(n, m - 1).add(get(n - 1, m));
    }
  };

  @Override
  public Z next() {
    if (++mM > mL) {
      mL = rowLength(++mN);
      mM = 1;
    }
    return mB.get(mN, mM);
  }
}
