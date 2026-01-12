package irvine.oeis.a391;

import irvine.factor.factor.Jaguar;
import irvine.math.function.Functions;
import irvine.math.z.Z;
import irvine.oeis.Sequence2;

/**
 * A391966 Smallest integer k greater than 1 such that every solution of y^m = y (for all integers m &gt; 1) in the commutative ring of n-adic integers is also a solution of y^k = y.
 * @author Sean A. Irvine
 */
public class A391966 extends Sequence2 {

  private long mN = 1;

  @Override
  public Z next() {
    final long r = Functions.SQUARE_FREE_KERNEL.l(++mN);
    if (r == 2) {
      return Z.THREE;
    }
    Z lcm = Z.ONE;
    for (final Z p : Jaguar.factor(r).toZArray()) {
      if (!Z.TWO.equals(p)) {
        lcm = lcm.lcm(p.subtract(1));
      }
    }
    return lcm.add(1);
  }
}

