package irvine.oeis.a078;

import irvine.math.z.Z;
import irvine.oeis.Sequence;
import irvine.oeis.a000.A000422;
import irvine.oeis.a007.A007908;

/**
 * A078206 Smallest multiple of the concatenation of n down to 1 that begins with the concatenation of 1 up to n.
 * @author Sean A. Irvine
 */
public class A078206 extends A007908 {

  private final Sequence mR = new A000422();

  @Override
  public Z next() {
    final Z up = super.next();
    final Z down = mR.next();
    if (up.isOne()) {
      return Z.ONE;
    }
    Z tens = Z.ONE;
    while (true) {
      tens = tens.multiply(10);
      final Z v = down.subtract(tens.modMultiply(up, down));
      if (v.compareTo(tens) < 0) {
        return up.multiply(tens).add(v);
      }
    }
  }
}

