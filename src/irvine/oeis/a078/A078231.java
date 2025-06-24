package irvine.oeis.a078;

import irvine.math.z.Z;
import irvine.oeis.Sequence;
import irvine.oeis.Sequence1;
import irvine.oeis.a000.A000312;

/**
 * A078231 a(n) = A078230(n)/(n^n).
 * @author Sean A. Irvine
 */
public class A078231 extends Sequence1 {

  private final Sequence mS = new A000312().skip();
  private long mN = 0;

  @Override
  public Z next() {
    final Z nn = mS.next();
    final Z n = Z.valueOf(++mN);
    if (Z.ONE.equals(nn)) {
      return Z.ONE;
    }
    Z tens = Z.ONE;
    while (true) {
      tens = tens.multiply(10);
      final Z w = n.multiply(tens);
      if (w.mod(nn).isZero()) {
        return w.divide(nn);
      }
      final Z v = nn.subtract(tens.modMultiply(n, nn));
      if (v.compareTo(tens) < 0) {
        return w.add(v).divide(nn);
      }
    }
  }
}

