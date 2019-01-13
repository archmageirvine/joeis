package irvine.oeis.a016;

import irvine.math.z.Z;
import irvine.oeis.a007.A007448;
import irvine.util.array.DynamicArray;

/**
 * A016046.
 * @author Sean A. Irvine
 */
public class A016046 extends A007448 {

  private final DynamicArray<Z> mFirst = new DynamicArray<>();
  private int mN = 0;
  private Z mPrev = super.next();

  @Override
  public Z next() {
    ++mN;
    while (mFirst.get(mN) == null) {
      int c = 1;
      Z t;
      while ((t = super.next()).equals(mPrev)) {
        ++c;
      }
      if (mFirst.get(c) == null) {
        mFirst.set(c, mPrev);
      }
      mPrev = t;
    }
    return mFirst.get(mN);
  }
}
