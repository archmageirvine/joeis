package irvine.oeis.a345;

import irvine.math.z.Z;
import irvine.oeis.Sequence;
import irvine.util.string.English;

/**
 * A345126.
 * @author Sean A. Irvine
 */
public class A345126 implements Sequence {

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

