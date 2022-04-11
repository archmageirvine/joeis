package irvine.oeis.a055;

import irvine.math.z.Z;
import irvine.oeis.Sequence;
import irvine.util.array.LongDynamicArray;

/**
 * A055992 n written efficiently in natural numbers base, i.e., in form ...wxyz where n  =1*z + 2*y + 3*x + 4*w + ... with z &lt; 1, y &lt; 2, x &lt; 3, w &lt; 4, ...
 * @author Sean A. Irvine
 */
public class A055992 implements Sequence {

  private final LongDynamicArray<Z> mA = new LongDynamicArray<>();
  private long mN = 1;
  private long mK = 1;

  private void insert(final long k, final long sum, final Z rep) {
    if (k <= 1) {
      if (mA.get(sum) == null) {
        mA.set(sum, rep);
      }
      return;
    }
    for (long j = rep.isZero() ? 1 : 0; j < k; ++j) {
      insert(k - 1, sum + j * k, rep.multiply(10).add(j));
    }
  }

  @Override
  public Z next() {
    ++mN;
    while (mA.get(mN) == null) {
      insert(++mK, 0, Z.ZERO);
    }
    return mA.get(mN).multiply(10);
  }
}

