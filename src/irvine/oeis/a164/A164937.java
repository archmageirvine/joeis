package irvine.oeis.a164;

import java.util.TreeSet;

import irvine.math.z.Z;
import irvine.oeis.Sequence0;

/**
 * A164937 Near-repdigit primes.
 * @author Sean A. Irvine
 */
public class A164937 extends Sequence0 {

  // After Michael S. Branicky

  private int mDigits = 2;
  private final TreeSet<Z> mA = new TreeSet<>();

  @Override
  public Z next() {
    while (mA.isEmpty()) {
      ++mDigits;
      // One differing digit is at the end.
      for (char end : new char[] {'1', '3', '7', '9'}) {
        for (char c = '1'; c <= '9'; ++c) {
          if (c != end) {
            final String s = String.valueOf(c).repeat(mDigits - 1) + end;
            final Z t = new Z(s);
            if (t.isProbablePrime()) {
              mA.add(t);
            }
          }
        }
        // One differing digit in the interior.
        for (char diff = '0'; diff <= '9'; ++diff) {
          if (diff == end) {
            continue;
          }
          for (int i = 0; i < mDigits - 1; ++i) {
            final StringBuilder sb = new StringBuilder(mDigits);
            for (int k = 0; k < i; ++k) {
              sb.append(end);
            }
            sb.append(diff);
            for (int k = i + 1; k < mDigits; ++k) {
              sb.append(end);
            }
            if (sb.charAt(0) != '0') {
              final Z t = new Z(sb);
              if (t.isProbablePrime()) {
                mA.add(t);
              }
            }
          }
        }
      }
    }
    return mA.pollFirst();
  }
}
