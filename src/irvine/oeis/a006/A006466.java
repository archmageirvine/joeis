package irvine.oeis.a006;

import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A006466.
 * @author Sean A. Irvine
 */
public class A006466 implements Sequence {

  private long mN = -1;

  private Z compute(final long n) {
    if (n >= 4) {
      final long r = n % 20;
      if (r == 4 || n % 40 == 29) {
        return Z.TWO;
      } else if (r == 19) {
        return compute(10 * (n / 20) + 9);
      } else if (n % 5 == 2) {
        return Z.THREE.subtract(compute(n - 3));
      }
    }
    return Z.ONE;
  }

  @Override
  public Z next() {
    return compute(++mN);
  }
}
