package irvine.oeis.a053;

import java.util.TreeSet;

import irvine.math.z.Z;
import irvine.oeis.a005.A005900;

/**
 * A053701 Vertically symmetric numbers.
 * @author Sean A. Irvine
 */
public class A053701 extends A005900 {

  /** Construct the sequence. */
  public A053701() {
    super(1);
  }

  private static final char[] DIGITS = {'0', '1', '2', '5', '8'};
  private final TreeSet<Z> mA = new TreeSet<>();
  private int mLength = -1; // Length of half the number!
  private long mLimit = 1;

  private StringBuilder reverseSpecial(final CharSequence s) {
    final StringBuilder sb = new StringBuilder();
    for (int k = s.length() - 1; k >= 0; --k) {
      final char c = s.charAt(k);
      switch (c) {
        case '2':
          sb.append('5');
          break;
        case '5':
          sb.append('2');
          break;
        default:
          sb.append(c);
          break;
      }
    }
    return sb;
  }

  @Override
  public Z next() {
    if (mA.isEmpty()) {
      if (++mLength == 0) {
        mA.add(Z.ONE);
        mA.add(Z.EIGHT);
        return Z.ZERO;
      }
      final long start = mLimit;
      mLimit *= DIGITS.length;
      for (long k = start; k < mLimit; ++k) {
        final StringBuilder sb = new StringBuilder();
        long m = k;
        for (int j = 0; j < mLength; ++j) {
          sb.append(DIGITS[(int) m % DIGITS.length]);
          m /= DIGITS.length;
        }
        final String rev = reverseSpecial(sb).toString();
        mA.add(new Z(rev + sb)); // even length
        mA.add(new Z(rev + '0' + sb)); // odd length
        mA.add(new Z(rev + '1' + sb)); // odd length
        mA.add(new Z(rev + '8' + sb)); // odd length
      }
    }
    return mA.pollFirst();
  }
}
