package irvine.oeis.a076;

import irvine.math.z.Z;
import irvine.oeis.Sequence;
import irvine.oeis.Sequence1;
import irvine.oeis.a006.A006882;

/**
 * A076199 a(n) equals the least s&gt;0 such that n!! + s^2 is prime.
 * @author Sean A. Irvine
 */
public class A076199 extends Sequence1 {

  private final Sequence mA = new A006882().skip();

  @Override
  public Z next() {
    final Z df = mA.next();
    long s = 0;
    while (true) {
      if (df.add(++s * s).isProbablePrime()) {
        return Z.valueOf(s);
      }
    }
  }
}
