package irvine.oeis.a082;

import irvine.math.function.Functions;
import irvine.math.predicate.Fibonacci;
import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A082213 a(1) = 1, a(n) = smallest number such that the concatenation of a(n-1) and a(n) is a Fibonacci number.
 * @author Sean A. Irvine
 */
public class A082213 extends Sequence1 {

  private Z mA = null;

  @Override
  public Z next() {
    if (mA == null) {
      mA = Z.ONE;
      return Z.ONE;
    }
    Z lo = mA.multiply(10).add(1);
    Z hi = mA.add(1).multiply(10);
    Z mod = Z.TEN;
    while (true) {
      int r = Fibonacci.inverseFibonacci(lo);
      while (true) {
        final Z c = Functions.FIBONACCI.z(r);
        if (c.compareTo(hi) >= 0) {
          break;
        }
        if (c.compareTo(lo) >= 0) {
          mA = c.mod(mod);
          return mA;
        }
        ++r;
      }
      mod = mod.multiply(10);
      lo = lo.multiply(10);
      hi = hi.multiply(10).add(9);
    }
  }
}
