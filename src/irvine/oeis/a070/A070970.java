package irvine.oeis.a070;

import irvine.math.z.Z;
import irvine.oeis.Sequence;
import irvine.oeis.Sequence1;
import irvine.oeis.a065.A065422;

/**
 * A070964.
 * @author Sean A. Irvine
 */
public class A070970 extends Sequence1 {

  private long mN = 0;

  @Override
  public Z next() {
    ++mN;
    final Sequence seq = new A065422().skip();
    Z a = seq.next();
    long k = 1;
    while (true) {
      ++k;
      final Z b = a;
      a = seq.next();
      final Z[] qr = b.divideAndRemainder(a);
      if (qr[1].isZero() && qr[0].equals(Z.valueOf(k).pow(mN))) {
        return Z.valueOf(k);
      }
    }
  }
}
