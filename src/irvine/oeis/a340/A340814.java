package irvine.oeis.a340;

import java.util.ArrayList;

import irvine.math.MemoryFunction2;
import irvine.math.z.Z;
import irvine.oeis.Sequence;
import irvine.oeis.a242.A242249;
import irvine.oeis.transform.EulerTransformSequence;

/**
 * A340814.
 * @author Sean A. Irvine
 */
public class A340814 extends MemoryFunction2<Integer, Z> implements Sequence {

  private int mN = -1;
  private int mM = 0;
  private final MemoryFunction2<Integer, Z> mA = new A242249();

  @Override
  protected Z compute(final Integer n, final Integer k) {
    if (n < 2) {
      return Z.ONE;
    }
    final ArrayList<Z> col = new ArrayList<>(n + 1);
    for (int j = 1; j <= n; ++j) {
      col.add(mA.get(j, k + 1));
    }
    return EulerTransformSequence.eulerTransform(col, n);
  }

  @Override
  public Z next() {
    if (++mM > mN) {
      ++mN;
      mM = 0;
    }
    return get(mM, mN - mM);
  }
}
