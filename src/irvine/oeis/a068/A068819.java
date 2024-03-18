package irvine.oeis.a068;

import irvine.math.z.Z;
import irvine.oeis.Sequence;
import irvine.oeis.Sequence1;
import irvine.oeis.a000.A000142;

/**
 * A068819 n!/((n+1)*(n+2)*...*(n+k)) where k is largest value that gives an integer quotient.
 * @author Sean A. Irvine
 */
public class A068819 extends Sequence1 {

  private long mN = 0;
  private final Sequence mF = new A000142().skip();

  @Override
  public Z next() {
    Z f = mF.next();
    long k = ++mN;
    while (true) {
      final Z[] qr = f.divideAndRemainder(Z.valueOf(++k));
      if (!qr[1].isZero()) {
        return f;
      }
      f = qr[0];
    }
  }
}
