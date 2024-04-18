package irvine.oeis.a066;

import irvine.math.function.Functions;
import irvine.math.z.Z;
import irvine.util.array.DynamicArray;

/**
 * A066673 Smallest term x from A066669 such that phi(x) = 2^n times some prime.
 * @author Sean A. Irvine
 */
public class A066673 extends A066669 {

  private final DynamicArray<Z> mFirsts = new DynamicArray<>();
  private int mN = 0;

  @Override
  public Z next() {
    ++mN;
    while (mFirsts.get(mN) == null) {
      final Z t = super.next();
      final int b = (int) Functions.PHI.z(t).makeOdd().auxiliary();
      if (mFirsts.get(b) == null) {
        mFirsts.set(b, t);
      }
    }
    return mFirsts.get(mN);
  }
}
