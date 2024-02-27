package irvine.oeis.a068;

import irvine.math.MemoryFunctionInt3;
import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A068620 Number of strings over Z_4 of length n with trace 0 and subtrace 0.
 * @author Sean A. Irvine
 */
public class A068620 extends Sequence1 {

  private int mN = 0;

  protected final MemoryFunctionInt3<Z> mS = new MemoryFunctionInt3<>() {
    @Override
    protected Z compute(final int n, final int t, final int s) {
      if (n == 1) {
        return s == 0 ? Z.ONE : Z.ZERO;
      }
      return get(n - 1, t, s).add(get(n - 1, (t + 3) % 4, (s + 3 * t + 1) % 4)).add(get(n - 1, (t + 2) % 4, (s + 2 * t) % 4)).add(get(n - 1, (t + 1) % 4, (s + t + 1) % 4));
    }
  };

  @Override
  public Z next() {
    return mS.get(++mN, 0, 0);
  }
}
