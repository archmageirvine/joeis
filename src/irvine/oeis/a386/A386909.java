package irvine.oeis.a386;

import irvine.math.z.Z;
import irvine.oeis.Sequence0;

/**
 * A386909 Iterates of g(x), starting at x = 0 until g(x) == 2 (mod 3), where g(x) = (5*x + 18)/3 if x == 0 (mod 3) and g(x) = (5*x + 22)/3 if x == 1 (mod 3).
 * @author Gregory Morse
 */
public class A386909 extends Sequence0 {
  private Z mA = Z.ZERO;

  @Override
  public Z next() {
    if (mA == null) {
      return null;
    }
    final Z a = mA;
    final long r = a.mod(3);
    mA = r == 2 ? null : a.multiply(5).add(r == 0 ? 18 : 22).divide(3);
    return a;
  }
}
