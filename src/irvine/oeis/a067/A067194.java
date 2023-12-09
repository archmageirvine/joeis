package irvine.oeis.a067;

import irvine.math.z.Z;
import irvine.math.z.ZUtils;
import irvine.oeis.a000.A000040;

/**
 * A067194 Sequence of prime numbers whose reverse is a nontrivial prime power (A025475).
 * @author Sean A. Irvine
 */
public class A067194 extends A000040 {

  private boolean isPrimePower(final Z n) {
    final Z t = n.isPower();
    return t != null && t.isProbablePrime();
  }

  @Override
  public Z next() {
    while (true) {
      final Z p = super.next();
      final Z r = ZUtils.reverse(p);
      if (!r.isProbablePrime() && isPrimePower(r)) {
        return p;
      }
    }
  }
}

