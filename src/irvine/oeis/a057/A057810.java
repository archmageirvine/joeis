package irvine.oeis.a057;

import irvine.math.z.Z;
import irvine.oeis.a000.A000720;

/**
 * A057810 Quotients n/pi(n) for n in A057809.
 * @author Georg Fischer
 */
public class A057810 extends A000720 {

  private int mN = 1;

  {
    super.next();
  }

  @Override
  public Z next() {
    while (true) {
      final Z[] quot = Z.valueOf(++mN).divideAndRemainder(super.next());
      if (quot[1].isZero()) {
        return quot[0];
      }
    }
  }
}
