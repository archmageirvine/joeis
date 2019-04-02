package irvine.oeis.a005;

import irvine.math.z.Z;
import irvine.oeis.Sequence;
import irvine.oeis.a000.A000045;

/**
 * A005086 Number of Fibonacci numbers 1,2,3,5,... dividing n.
 * @author Sean A. Irvine
 */
public class A005086 implements Sequence {

  private Z mN = Z.ZERO;

  static Sequence fibo() {
    final Sequence seq = new A000045();
    seq.next();
    seq.next();
    return seq;
  }

  @Override
  public Z next() {
    mN = mN.add(1);
    long c = 0;
    final Sequence fibo = fibo();
    Z d;
    while ((d = fibo.next()).compareTo(mN) <= 0) {
      if (Z.ZERO.equals(mN.mod(d))) {
        ++c;
      }
    }
    return Z.valueOf(c);
  }
}

