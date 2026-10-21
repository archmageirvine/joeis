package irvine.oeis.a086;

import irvine.math.z.Z;
import irvine.oeis.a000.A000040;

/**
 * A086968 Numbers n such that n^2 is a sum k-th prime + k for some k.
 * @author Sean A. Irvine
 */
public class A086968 extends A000040 {

  private long mN = 0;

  @Override
  public Z next() {
    while (true) {
      final Z p = super.next();
      final Z t = p.add(++mN);
      final Z[] s = t.sqrtAndRemainder();
      if (s[1].isZero()) {
        return s[0];
      }
    }
  }
}
