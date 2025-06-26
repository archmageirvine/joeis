package irvine.oeis.a078;

import irvine.math.z.Z;
import irvine.oeis.Sequence;
import irvine.oeis.a000.A000422;
import irvine.oeis.a007.A007908;

/**
 * A078205 a(n) = A078204(n) / A007908(n).
 * @author Sean A. Irvine
 */
public class A078205 extends A007908 {

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
      final Z v = up.subtract(tens.modMultiply(down, up));
      if (v.compareTo(tens) < 0) {
        return down.multiply(tens).add(v).divide(up);
      }
    }
  }
}

