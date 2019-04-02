package irvine.oeis.a007;

import java.util.Arrays;
import java.util.HashSet;

import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A007926 Some permutation of digits is a factorial number.
 * @author Sean A. Irvine
 */
public class A007926 implements Sequence {

  private Z mN = Z.ZERO;
  private final HashSet<String> mSortedFactorials = new HashSet<>();
  private Z mF = Z.ONE;
  private long mM = 0;

  private String sort(final Z n) {
    final char[] digits = n.toString().toCharArray();
    Arrays.sort(digits);
    return new String(digits);
  }

  @Override
  public Z next() {
    while (true) {
      mN = mN.add(1);
      while (mN.bitLength() + 4 >= mF.bitLength()) { // +4 probably not needed
        mF = mF.multiply(++mM);
        mSortedFactorials.add(sort(mF));
      }
      // Need to be a little careful with leading 0s
      String s = sort(mN);
      if (mSortedFactorials.contains(s)) {
        return mN;
      }
      while (s.charAt(0) == '0') {
        s = s.substring(1);
        if (mSortedFactorials.contains(s)) {
          return mN;
        }
      }
    }
  }
}
