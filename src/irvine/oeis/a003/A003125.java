package irvine.oeis.a003;

import irvine.math.MemoryFunction2;
import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A003125 Value of <code>an</code> urn with n balls of type <code>-1</code> and <code>n+2</code> balls of type <code>+1</code>.
 * @author Sean A. Irvine
 */
public class A003125 extends MemoryFunction2<Integer, Z> implements Sequence {

  private static class AFunction extends MemoryFunction2<Integer, Z> {
    @Override
    protected Z compute(final Integer m, final Integer p) {
      if (m < 0 || p < 0) {
        return Z.ZERO;
      }
      if (m == 0 && p == 0) {
        return Z.ZERO;
      }
      if (m == 1 && p == 0) {
        return Z.NEG_ONE;
      }
      if (m == 0 && p == 1) {
        return Z.ONE;
      }
      return get(m - 1, p).add(get(m, p - 1));
    }
  }

  private final MemoryFunction2<Integer, Z> mA = new AFunction();
  private int mN = -1;

  @Override
  protected Z compute(final Integer m, final Integer p) {
    if (m < 0 || p < 0) {
      return Z.ZERO;
    }
    return Z.ZERO.max(mA.get(m, p).add(get(m - 1, p).add(get(m, p - 1))));
  }

  protected int delta() {
    return 2;
  }

  @Override
  public Z next() {
    ++mN;
    return get(mN, mN + delta());
  }

}

