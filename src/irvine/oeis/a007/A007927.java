package irvine.oeis.a007;

import java.util.Arrays;
import java.util.HashSet;

import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A007927 Some nontrivial permutation of digits is a factorial number.
 * @author Sean A. Irvine
 */
public class A007927 extends Sequence1 {

  // Essentially A007926 minus the factorials themselves

  private Z mN = Z.ZERO;
  private final HashSet<String> mSortedFactorials = new HashSet<>();
  private final HashSet<Z> mFactorials = new HashSet<>();
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
        mFactorials.add(mF);
      }
      if (!mFactorials.contains(mN)) {
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
}
