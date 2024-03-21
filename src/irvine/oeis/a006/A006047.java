package irvine.oeis.a006;

import irvine.math.z.Z;
import irvine.math.z.ZUtils;
import irvine.oeis.DirectSequence;
import irvine.oeis.Sequence0;
import irvine.util.array.LongDynamicArray;

/**
 * A006047 Number of entries in n-th row of Pascal's triangle not divisible by 3.
 * @author Sean A. Irvine
 */
public class A006047 extends Sequence0 implements DirectSequence {

  private final LongDynamicArray<Z> mA = new LongDynamicArray<>();

  {
    mA.set(0, Z.ONE);
    mA.set(1, Z.TWO);
    mA.set(2, Z.THREE);
  }

  private long mM = 0;
  protected long mN = -1;

  @Override
  public Z a(final Z n) {
    final int[] counts = ZUtils.digitCounts(n, 3);
    return Z.TWO.pow(counts[1]).multiply(Z.THREE.pow(counts[2]));
  }

  @Override
  public Z a(final int n) {
    return a(Z.valueOf(n));
  }

  @Override
  public Z next() {
    if (++mN >= mA.length()) {
      final Z t = mA.get(++mM);
      mA.set(mA.length(), t);
      mA.set(mA.length(), t.multiply2());
      mA.set(mA.length(), t.multiply(3));
    }
    return mA.get(mN);
  }
}
