package irvine.oeis.a007;

import java.util.ArrayList;

import irvine.oeis.memory.MemoryFunctionSequence;
import irvine.math.z.Z;

/**
 * A007152 Evolutionary trees of magnitude n.
 * @author Sean A. Irvine
 */
public class A007152 extends MemoryFunctionSequence<Integer, Z> {

  // After R. J. Mathar

  private final A007151 mA007151 = new A007151();
  private final ArrayList<Z> mA = new ArrayList<>();
  {
    mA.add(null);
  }
  private int mN = 0;

  private Z a7151(final int n) {
    while (n >= mA.size()) {
      mA.add(mA007151.next());
    }
    return mA.get(n);
  }

  @Override
  protected Z compute(final Integer n) {
    return n <= 1 ? Z.ZERO : a7151(n).subtract(a7151(n - 1)).add(get(n - 1).multiply(n - 1)).divide2();
  }

  @Override
  public Z next() {
    if (++mN == 1) {
      return Z.ONE;
    }
    return a7151(mN - 1).add(get(mN - 1));
  }
}
