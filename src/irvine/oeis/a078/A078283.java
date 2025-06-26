package irvine.oeis.a078;

import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A078283 a(1) = 1, a(n) is the smallest multiple of n which is obtained by inserting/prefixing or suffixing at least one digit in a(n-1).
 * @author Sean A. Irvine
 */
public class A078283 extends Sequence1 {

  private Z mA = Z.ONE;
  private long mN = 0;

  @Override
  public Z next() {
    if (++mN > 1) {
      final String s = mA.toString();
      mA = null;
      for (int pos = 0; pos <= s.length(); ++pos) {
        final String left = s.substring(0, pos);
        final String right = s.substring(pos);
        for (int digit = pos == 0 ? 1 : 0; digit < 10; ++digit) {
          final Z t = new Z(left + digit + right);
          if (t.mod(mN) == 0 && (mA == null || t.compareTo(mA) < 0)) {
            mA = t;
          }
        }
      }
      if (mA == null) {
        for (int pos1 = 0; pos1 <= s.length(); ++pos1) {
          final String left = s.substring(0, pos1);
          for (int pos2 = pos1; pos2 <= s.length(); ++pos2) {
            final String mid = s.substring(pos1, pos2);
            final String right = s.substring(pos2);
            for (int digit1 = pos1 == 0 ? 1 : 0; digit1 < 10; ++digit1) {
              for (int digit2 = 0; digit2 < 10; ++digit2) {
                final Z t = new Z(left + digit1 + mid + digit2 + right);
                if (t.mod(mN) == 0 && (mA == null || t.compareTo(mA) < 0)) {
                  mA = t;
                }
              }
            }
          }
        }
      }
    }
    if (mA == null) {
      throw new RuntimeException("Inserting 1 or 2 digits was not sufficient");
    }
    return mA;
  }
}

