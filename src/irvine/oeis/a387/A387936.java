package irvine.oeis.a387;

import irvine.math.MemoryFunctionInt6;
import irvine.math.z.Z;
import irvine.oeis.Sequence1;
/**
 * A387936 Triangle read by rows: T(n,k) is the number of 4-dimensional balanced ballot paths of 4n steps with exactly k peaks.
 * @author Sean A. Irvine
 */
public class A387936 extends Sequence1 {

  private int mN = 0;
  private int mM = 0;
  private final MemoryFunctionInt6<Z> mB = new MemoryFunctionInt6<>() {
    @Override
    protected Z compute(final int x, final int y, final int z, final int w, final int last, final int s) {
      if (x == 0 && y == 0 && z == 0 && w == 0) {
        return s == 0 ? Z.ONE : Z.ZERO;
      }
      final int xu = mN - x;
      final int yu = mN - y;
      final int zu = mN - z;
      final int wu = mN - w;
      if (!(xu >= yu && yu >= zu && zu >= wu) || s < 0) {
        return Z.ZERO;
      }
      Z total = Z.ZERO;
      if (x > 0) {
        total = total.add(get(x - 1, y, z, w, 0, s));
      }
      final int newS = s - (last == 0 ? 1 : 0);
      if (y > 0 && xu >= yu + 1) {
        total = total.add(get(x, y - 1, z, w, 1, newS));
      }
      if (z > 0 && yu >= zu + 1) {
        total = total.add(get(x, y, z - 1, w, 2, newS));
      }
      if (w > 0 && zu >= wu + 1) {
        total = total.add(get(x, y, z, w - 1, 3, newS));
      }
      return total;
    }
  };

  @Override
  public Z next() {
    if (++mM > mN) {
      ++mN;
      mM = 1;
    }
    return mB.get(mN, mN, mN, mN, -1, mM);
  }
}
