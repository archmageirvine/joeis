package irvine.oeis.a007;

import java.util.Arrays;
import java.util.HashSet;

import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A007939.
 * @author Sean A. Irvine
 */
public class A007939 implements Sequence {

  private Z mN = Z.ZERO;
  private final HashSet<String> mSortedCubes = new HashSet<>();
  private Z mM = Z.ZERO;
  private Z mCube = Z.ZERO;

  private String sort(final Z n) {
    final char[] digits = n.toString().toCharArray();
    Arrays.sort(digits);
    return new String(digits);
  }

  @Override
  public Z next() {
    while (true) {
      mN = mN.add(1);
      while (mN.bitLength() + 4 >= mCube.bitLength()) {
        mM = mM.add(1);
        mCube = mM.pow(3);
        mSortedCubes.add(sort(mCube));
      }
      // Need to be a little careful with leading 0s
      String s = sort(mN);
      if (mSortedCubes.contains(s)) {
        return mN;
      }
      while (s.charAt(0) == '0') {
        s = s.substring(1);
        if (mSortedCubes.contains(s)) {
          return mN;
        }
      }
    }
  }
}
