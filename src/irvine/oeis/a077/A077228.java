package irvine.oeis.a077;

import irvine.math.z.Z;
import irvine.util.array.DynamicArray;

/**
 * A077228 Triangle of compositions with a total that is no more than n into exactly k parts each no more than k.
 * @author Sean A. Irvine
 */
public class A077228 extends A077227 {

  private int mN = 0;
  private int mM = 0;
  private final DynamicArray<Z> mSums = new DynamicArray<>();

  {
    setOffset(0);
  }

  @Override
  public Z next() {
    if (++mM > mN) {
      ++mN;
      mM = 1;
      mSums.set(mN, Z.ZERO);
    }
    mSums.set(mM, mSums.get(mM).add(t(mN, mM)));
    return mSums.get(mM);
  }
}

