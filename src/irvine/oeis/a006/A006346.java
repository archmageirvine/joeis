package irvine.oeis.a006;

import irvine.math.z.Z;

/**
 * A006346.
 * @author Sean A. Irvine
 */
public class A006346 extends A006345 {

  @Override
  public Z next() {
    if (mSeq.isEmpty()) {
      mSeq = "1";
      return Z.ZERO;
    }
    int k = (mSeq.length() + 1) / 2;
    while (true) {
      if (matches(--k)) {
        if (mSeq.charAt(k) == '1') {
          mSeq = "2" + mSeq;
        } else {
          mSeq = "1" + mSeq;
        }
        return Z.valueOf(k + 1);
      }
    }
  }
}

