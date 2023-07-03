package irvine.oeis.a007;

import irvine.oeis.memory.MemoryFunction1Sequence;
import irvine.math.z.Z;

/**
 * A007729 6th binary partition function.
 * @author Sean A. Irvine
 */
public class A007729 extends MemoryFunction1Sequence<Z> {

  // After Alois P. Heinz

  private int mN = 0;
  private Z mA = Z.ZERO;

  @Override
  protected Z compute(final int n) {
    if (n < 2) {
      return Z.valueOf(n);
    }
    return (n & 1) == 0 ? get(n / 2) : get((n - 1) / 2).add(get((n + 1) / 2));
  }

  @Override
  public Z next() {
    mA = mA.add(get(++mN));
    return mA;
  }
}
