package irvine.oeis.a383;

import irvine.math.function.Functions;
import irvine.math.z.Z;
import irvine.oeis.Sequence1;
import irvine.util.array.LongDynamicBooleanArray;

/**
 * A383789 a(1) = 1; for n &gt; 1, a(n) is the smallest positive integer not already in the sequence such that it shares at least one digit with a(n-1), and it has a different number of digits from a(n-1).
 * @author Sean A. Irvine
 */
public class A383789 extends Sequence1 {

  private final LongDynamicBooleanArray mSeen = new LongDynamicBooleanArray();
  private long mA = 10; // convenient way to get 1 for first term
  private long mS = 1;

  @Override
  public Z next() {
    while (mSeen.isSet(mS)) {
      ++mS;
    }
    long k = mS;
    final int syn = Functions.SYNDROME.i(mA);
    final int len = Functions.DIGIT_LENGTH.i(mA);
    while (true) {
      while (mSeen.isSet(k)) {
        ++k;
      }
      if ((Functions.SYNDROME.i(k) & syn) != 0 && Functions.DIGIT_LENGTH.i(k) != len) {
        mSeen.set(k);
        mA = k;
        return Z.valueOf(k);
      }
      ++k;
    }
  }
}

