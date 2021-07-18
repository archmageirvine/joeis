package irvine.oeis.a049;

import java.util.ArrayList;

import irvine.math.MemoryFunction;
import irvine.math.z.Z;
import irvine.oeis.Sequence;
import irvine.oeis.a002.A002896;

/**
 * A049037 Number of cubic lattice walks that start and end at origin after 2n steps, not touching origin at intermediate stages.
 * @author Sean A. Irvine
 */
public class A049037 extends MemoryFunction<Integer, Z> implements Sequence {

  // After Alois P. Heinz

  private final Sequence mBSeq = new A002896();
  private final ArrayList<Z> mB = new ArrayList<>();
  private int mN = -1;

  @Override
  protected Z compute(final Integer n) {
    if (n < 1) {
      return Z.NEG_ONE;
    }
    Z sum = Z.ZERO;
    for (int k = 1; k <= n; ++k) {
      sum = sum.subtract(get(n - k).multiply(mB.get(k)));
    }
    return sum;
  }

  @Override
  public Z next() {
    mB.add(mBSeq.next());
    return getValue(++mN).abs();
  }
}
