package irvine.oeis.a001;

import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A001387 The binary "look and say" sequence.
 * @author Sean A. Irvine
 */
public class A001387 implements Sequence {

  private String mA = null;

  protected String start() {
    return "1";
  }

  protected int base() {
    return 2;
  }

  @Override
  public Z next() {
    if (mA == null) {
      mA = start();
      return new Z(mA);
    }
    final StringBuilder sb = new StringBuilder();
    int k = 0;
    while (k < mA.length()) {
      final char c = mA.charAt(k);
      int cnt = 1;
      while (++k < mA.length() && mA.charAt(k) == c) {
        ++cnt;
      }
      sb.append(Integer.toString(cnt, base())).append(c);
    }
    mA = sb.toString();
    return new Z(mA);
  }
}
