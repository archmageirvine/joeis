package irvine.oeis.a000;

import irvine.math.z.Z;
import irvine.oeis.AbstractSequence;
import irvine.util.array.LongDynamicArray;

/**
 * A000123 Number of binary partitions: number of partitions of 2n into powers of 2.
 * @author Sean A. Irvine
 */
public class A000123 extends AbstractSequence {

  /* Construct the sequence. */
  public A000123() {
    super(0);
  }

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

