package irvine.oeis.a383;

import irvine.math.function.Functions;
import irvine.math.z.Z;
import irvine.oeis.Sequence1;
import irvine.util.array.LongDynamicBooleanArray;

/**
 * A383789 allocated for Ali Sada.
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

