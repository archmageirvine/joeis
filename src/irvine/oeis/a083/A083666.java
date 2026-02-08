package irvine.oeis.a083;

import java.util.TreeSet;

import irvine.math.predicate.Predicates;
import irvine.math.z.Z;
import irvine.oeis.Sequence1;
import irvine.util.array.LongDynamicBooleanArray;

/**
 * A083666 Palindromes arising when building A083664.
 * @author Sean A. Irvine
 */
public class A083666 extends Sequence1 {

  private final TreeSet<Z> mS = new TreeSet<>();
  private final LongDynamicBooleanArray mUsed = new LongDynamicBooleanArray();
  private long mN = 0;
  private Z mA = null;
  private Z mB = null;

  @Override
  public Z next() {
    while (mS.isEmpty() || mS.first().compareTo(mB) >= 0) {
      if (++mN == 1) {
        mB = Z.ONE;
        continue;
      }
      if (mN % 10 == 0) {
        mUsed.set(mN);
        mA = mB;
        mB = Z.valueOf(mN);
        continue;
      }
      final Z t = mN % 10 == 1 ? mA : mB;
      long k = 1;
      while (true) {
        if (!mUsed.isSet(++k) && Predicates.PALINDROME.is(t.multiply(k))) {
          mUsed.set(k);
          mA = mB;
          mB = Z.valueOf(k);
          mS.add(t.multiply(k));
          break;
        }
      }
    }
    return mS.pollFirst();
  }
}
