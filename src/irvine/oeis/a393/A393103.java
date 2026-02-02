package irvine.oeis.a393;

import irvine.math.z.Z;
import irvine.oeis.Sequence1;
import irvine.util.array.LongDynamicBooleanArray;

/**
 * A036057.
 * @author Sean A. Irvine
 */
public class A393103 extends Sequence1 {

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
    long runtime = 0;
    while (headPos >= 0) {
      ++runtime;
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
    return Z.valueOf(runtime);
  }
}

