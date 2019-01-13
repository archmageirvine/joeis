package irvine.oeis.a000;

import irvine.math.z.Z;
import irvine.oeis.Sequence;
import irvine.util.array.LongDynamicArray;

/**
 * A000123.
 * @author Sean A. Irvine
 */
public class A000123 implements Sequence {

  private long mN = -1;
  private final LongDynamicArray<Z> mA = new LongDynamicArray<>();

  @Override
  public Z next() {
    if (++mN == 0) {
      mA.set(0, Z.ONE);
      return Z.ONE;
    }
    final Z r = mA.get(mN - 1).add(mA.get(mN >>> 1));
    mA.set(mN, r);
    return r;
  }
}

