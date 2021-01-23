package irvine.oeis.a078;

import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A078274 a(n) is the number from which if odd-positioned digits are deleted then one gets the concatenation of first n odd numbers, while if even-positioned digits are deleted then one gets reverse concatenation of first n odd numbers. Position of least significant digit is considered to be 1.
 * @author Sean A. Irvine
 */
public class A078274 implements Sequence {

  private long mN = -1;
  private final StringBuilder mCat = new StringBuilder();

  @Override
  public Z next() {
    mN += 2;
    mCat.append(mN);
    final StringBuilder s = new StringBuilder();
    for (int k = 0; k < mCat.length(); ++k) {
      s.append(mCat.charAt(k)).append(mCat.charAt(mCat.length() - k - 1));
    }
    return new Z(s);
  }
}

