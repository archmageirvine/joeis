package irvine.oeis.a057;

import irvine.math.z.Z;
import irvine.oeis.a000.A000720;

/**
 * A057809 Numbers n such that pi(n) divides n.
 * @author Georg Fischer
 */
public class A057809 extends A000720 {

  private int mN = 1;

  {
    super.next();
  }

  @Override
  public Z next() {
    while (true) {
      final Z[] quot = Z.valueOf(++mN).divideAndRemainder(super.next());
      if (quot[1].isZero()) {
        return Z.valueOf(mN);
      }
    }
  }
}
