package irvine.oeis.a083;

import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A083468 Smallest multiple of n which is the reverse concatenation of n consecutive numbers.0 if no such number exists.
 * @author Sean A. Irvine
 */
public class A083468 extends Sequence1 {

  protected long mN = 0;

  @Override
  public Z next() {
    ++mN;
    final StringBuilder sb = new StringBuilder("1");
    long lo = 1;
    long loLim = 10;
    int delLen = 1;
    long hi = 1;
    while (hi < mN) {
      sb.insert(0, ++hi);
    }
    while (true) {
      final Z t = new Z(sb);
      if (t.mod(mN) == 0) {
        return t;
      }
      sb.delete(sb.length() - delLen, sb.length()).insert(0, ++hi);
      if (++lo == loLim) {
        loLim *= 10;
        ++delLen;
      }
    }
  }
}
