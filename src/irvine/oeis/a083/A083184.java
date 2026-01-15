package irvine.oeis.a083;

import irvine.math.function.Functions;
import irvine.math.z.Z;
import irvine.oeis.a002.A002385;
import irvine.util.array.DynamicArray;

/**
 * A083184 Smallest palindromic prime having a sum of digits = prime(n), or 0 if no such number exists.
 * @author Sean A. Irvine
 */
public class A083184 extends A002385 {

  private final DynamicArray<Z> mFirsts = new DynamicArray<>();
  private int mP = 1;

  @Override
  public Z next() {
    mP = Functions.NEXT_PRIME.i(mP);
    while (mFirsts.get(mP) == null) {
      final Z palin = super.next();
      final int d = Functions.DIGIT_SUM.i(palin);
      if (mFirsts.get(d) == null) {
        mFirsts.set(d, palin);
      }
    }
    return mFirsts.get(mP);
  }
}

