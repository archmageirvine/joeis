package irvine.oeis.a076;

import irvine.math.z.Z;
import irvine.oeis.Sequence;
import irvine.oeis.Sequence1;
import irvine.oeis.a006.A006882;

/**
 * A076200 a(n) equals the least s&gt;0 such that n!! + s^3 is prime, or 0 if there is no such prime.
 * @author Sean A. Irvine
 */
public class A076200 extends Sequence1 {

  private final Sequence mA = new A006882().skip();

  @Override
  public Z next() {
    final Z df = mA.next();
    if (Z.EIGHT.equals(df)) {
      return Z.ZERO;
    }
    Z s = Z.ZERO;
    while (true) {
      s = s.add(1);
      if (df.add(s.pow(3)).isProbablePrime()) {
        return s;
      }
    }
  }
}
