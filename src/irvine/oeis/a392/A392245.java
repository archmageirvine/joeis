package irvine.oeis.a392;

import irvine.math.z.Z;
import irvine.oeis.Sequence1;
import irvine.util.array.LongDynamicBooleanArray;

/**
 * A036057.
 * @author Sean A. Irvine
 */
public class A392245 extends Sequence1 {

  private long mN = 0;

  private LongDynamicBooleanArray initialTape(final long n) {
    final LongDynamicBooleanArray tape = new LongDynamicBooleanArray();
    long m = n;
    long k = 0;
    while (m != 0) {
      if ((m & 1) == 1) {
        tape.set(k);
      }
      ++k;
      m >>>= 1;
    }
    return tape;
  }

  @Override
  public Z next() {
    final LongDynamicBooleanArray tape = initialTape(++mN);
    long headPos = 0;
    boolean headFlag = true; // down
    while (headPos >= 0) {
      if (headFlag) {
        if (!tape.isSet(headPos)) {
          headFlag = false;
        }
        ++headPos;
      } else {
        if (tape.isSet(headPos)) {
          tape.clear(headPos);
          headFlag = true;
          ++headPos;
        } else {
          --headPos;
        }
      }
    }
    Z res = Z.ZERO;
    for (long k = tape.length() - 1; k >= 0; --k) {
      res = res.multiply2();
      if (tape.isSet(k)) {
        res = res.setBit(0);
      }
    }
    return res;
  }
}

