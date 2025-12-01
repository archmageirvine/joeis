package irvine.oeis.a082;

import irvine.math.function.Functions;
import irvine.math.z.Z;
import irvine.oeis.Sequence;
import irvine.oeis.Sequence1;
import irvine.oeis.a002.A002113;
import irvine.util.array.DynamicArray;

/**
 * A082217 Smallest palindrome beginning with n and digit sum n, or 0 if no such number exists.
 * @author Sean A. Irvine
 */
public class A082217 extends Sequence1 {

  private final Sequence mPalindromes = new A002113();
  private final DynamicArray<Z> mFirsts = new DynamicArray<>();
  private int mN = 0;

  @Override
  public Z next() {
    if (++mN == 19) {
      return Z.ZERO;
    }
    while (mFirsts.get(mN) == null) {
      final Z p = mPalindromes.next();
      final int s = Functions.DIGIT_SUM.i(p);
      if (mFirsts.get(s) == null && p.toString().startsWith(String.valueOf(s))) {
        mFirsts.set(s, p);
      }
    }
    return mFirsts.get(mN);
  }
}
