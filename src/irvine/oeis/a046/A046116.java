package irvine.oeis.a046;

import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A046116.
 * @author Sean A. Irvine
 */
public class A046116 implements Sequence {

  private long mN = 88;

  private boolean is(long m) {
    while ((m & 1) == 0) {
      final Z q = Z.valueOf(m - 1);
      if (q.isProbablePrime()) {
        return false;
      }
      final Z p = q.isPower();
      if (p != null && p.isProbablePrime()) {
        return false;
      }
      m >>>= 1;
    }
    return true;
  }

  @Override
  public Z next() {
    while (true) {
      mN += 4;
      if (is(mN)) {
        return Z.valueOf(mN);
      }
    }
  }
}
