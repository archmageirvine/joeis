package irvine.oeis.a155;

import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A155507 Emirps with digits 1 and 9 only.
 * @author Sean A. Irvine
 */
public class A155507 extends Sequence1 {

  private long mCurrent = 0;
  private long mCurrentLimit = 8;
  private int mLength = 3;
  private String mFront = "11";

  protected String step() {
    if (++mCurrent == mCurrentLimit) {
      mCurrentLimit *= 2;
      mCurrent = 0;
      mFront = mFront + "1";
      ++mLength;
    }
    final String v = mFront + Long.toBinaryString(mCurrent).replace('1', '9').replace('0', '1');
    return v.substring(v.length() - mLength);
  }

  @Override
  public Z next() {
    while (true) {
      final String s = step();
      final Z n = new Z(s);
      if (n.isPrime()) {
        final Z t = new Z(new StringBuilder(s).reverse());
        if (n.compareTo(t) != 0 && t.isProbablePrime()) {
          return n;
        }
      }
    }
  }
}

