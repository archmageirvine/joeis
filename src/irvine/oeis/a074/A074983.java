package irvine.oeis.a074;

import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A074983.
 * @author Sean A. Irvine
 */
public class A074983 implements Sequence {

  private String mPrev = null;

  @Override
  public Z next() {
    if (mPrev == null) {
      mPrev = "12";
    } else {
      final StringBuilder sb = new StringBuilder();
      for (int k = 0; k < mPrev.length(); ++k) {
        if (mPrev.charAt(k) == '1') {
          sb.append('1');
        }
        sb.append("12");
      }
      mPrev = new String(sb);
    }
    return new Z(mPrev);
  }
}
