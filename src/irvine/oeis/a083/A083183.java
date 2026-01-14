package irvine.oeis.a083;

import irvine.math.function.Functions;
import irvine.math.z.Z;
import irvine.oeis.a045.A045336;
import irvine.util.array.DynamicArray;

/**
 * A083128.
 * @author Sean A. Irvine
 */
public class A083183 extends A045336 {

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

