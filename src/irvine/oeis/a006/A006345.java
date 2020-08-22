package irvine.oeis.a006;

import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A006345 Linus sequence: a(n) "breaks the pattern" by avoiding the longest doubled suffix.
 * @author Sean A. Irvine
 */
public class A006345 implements Sequence {

  protected String mSeq = "";

  protected boolean matches(final int len) {
    for (int k = 0; k < len; ++k) {
      if (mSeq.charAt(len + 1 + k) != mSeq.charAt(k)) {
        return false;
      }
    }
    return true;
  }

  @Override
  public Z next() {
    if (mSeq.isEmpty()) {
      mSeq = "1";
      return Z.ONE;
    }
    int k = (mSeq.length() + 1) / 2;
    while (true) {
      if (matches(--k)) {
        // Sequence looks like zcz, we need to add complement of c to start
        if (mSeq.charAt(k) == '1') {
          mSeq = "2" + mSeq;
          return Z.TWO;
        } else {
          mSeq = "1" + mSeq;
          return Z.ONE;
        }
      }
    }
  }
}

