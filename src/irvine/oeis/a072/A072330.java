package irvine.oeis.a072;

import irvine.factor.factor.Jaguar;
import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A072330 Common difference n such that primitive triangles exist which are n-arithmetic (i.e., primitive Heronian triangles whose sides in arithmetic progression have common difference n).
 * @author Sean A. Irvine
 */
public class A072330 extends Sequence1 {

  // After R. J. Mathar

  private long mN = 0;

  private boolean is(final long n) {
    if (n == 1) {
      return true;
    }
    for (final Z p : Jaguar.factor(n).toZArray()) {
      final long r = p.mod(12);
      if (r != 1 && r != 11) {
        return false;
      }
    }
    return true;
  }

  @Override
  public Z next() {
    while (true) {
      if (is(++mN)) {
        return Z.valueOf(mN);
      }
    }
  }
}
