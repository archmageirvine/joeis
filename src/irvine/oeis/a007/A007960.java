package irvine.oeis.a007;

import java.util.Arrays;
import java.util.HashSet;

import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A007960.
 * @author Sean A. Irvine
 */
public class A007960 implements Sequence {

  private Z mN = Z.ZERO;
  private final HashSet<String> mSortedTriangular = new HashSet<>();
  private Z mP = Z.ZERO;
  private Z mT = Z.ZERO;

  private String sort(final Z n) {
    final char[] digits = n.toString().toCharArray();
    Arrays.sort(digits);
    return new String(digits);
  }

  @Override
  public Z next() {
    while (true) {
      mN = mN.add(1);
      while (mN.bitLength() + 4 >= mT.bitLength()) {
        mP = mP.add(1);
        mT = mP.multiply(mP.add(1)).divide2();
        mSortedTriangular.add(sort(mT));
      }
      // Need to be a little careful with leading 0s
      String s = sort(mN);
      if (mSortedTriangular.contains(s)) {
        return mN;
      }
      while (s.charAt(0) == '0') {
        s = s.substring(1);
        if (mSortedTriangular.contains(s)) {
          return mN;
        }
      }
    }
  }
}
