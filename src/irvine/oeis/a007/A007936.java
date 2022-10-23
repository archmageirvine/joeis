package irvine.oeis.a007;

import java.util.Arrays;
import java.util.HashSet;

import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A007936 Some permutation of digits is a square.
 * @author Sean A. Irvine
 */
public class A007936 extends Sequence1 {

  private Z mN = Z.ZERO;
  private final HashSet<String> mSortedSquares = new HashSet<>();
  private Z mM = Z.ZERO;
  private Z mSquare = Z.ZERO;

  private String sort(final Z n) {
    final char[] digits = n.toString().toCharArray();
    Arrays.sort(digits);
    return new String(digits);
  }

  @Override
  public Z next() {
    while (true) {
      mN = mN.add(1);
      while (mN.bitLength() + 4 >= mSquare.bitLength()) {
        mM = mM.add(1);
        mSquare = mM.square();
        mSortedSquares.add(sort(mSquare));
      }
      // Need to be a little careful with leading 0s
      String s = sort(mN);
      if (mSortedSquares.contains(s)) {
        return mN;
      }
      while (s.charAt(0) == '0') {
        s = s.substring(1);
        if (mSortedSquares.contains(s)) {
          return mN;
        }
      }
    }
  }
}
