package irvine.oeis.a345;

import irvine.math.z.Z;
import irvine.oeis.Sequence1;
import irvine.util.string.English;

/**
 * A345126 a(1) = 1; thereafter, a(n) = A073327(a(n-1)), using the British English version of A073327 when there is a choice.
 * @author Sean A. Irvine
 */
public class A345126 extends Sequence1 {

  private Z mA = null;

  @Override
  public Z next() {
    if (mA == null) {
      mA = Z.ONE;
    } else {
      final String s = English.SINGLETON.toText(mA.intValueExact());
      long sum = 0;
      for (int k = 0; k < s.length(); ++k) {
        final char c = s.charAt(k);
        if (Character.isLetter(c)) {
          sum += c - '`';
        }
      }
      mA = Z.valueOf(sum);
    }
    return mA;
  }
}

