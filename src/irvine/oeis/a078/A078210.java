package irvine.oeis.a078;

import irvine.math.z.Z;
import irvine.oeis.Sequence;
import irvine.oeis.Sequence1;
import irvine.oeis.a000.A000290;

/**
 * A078210 Smallest multiple of n^2 beginning with n.
 * @author Sean A. Irvine
 */
public class A078210 extends Sequence1 {

  private final Sequence mS = new A000290().skip();
  private long mN = 0;

  @Override
  public Z next() {
    final Z sq = mS.next();
    final Z n = Z.valueOf(++mN);
    if (Z.ONE.equals(sq)) {
      return Z.ONE;
    }
    Z tens = Z.ONE;
    while (true) {
      tens = tens.multiply(10);
      final Z w = n.multiply(tens);
      if (w.mod(sq).isZero()) {
        return w;
      }
      final Z v = sq.subtract(tens.modMultiply(n, sq));
      if (v.compareTo(tens) < 0) {
        return w.add(v);
      }
    }
  }
}

