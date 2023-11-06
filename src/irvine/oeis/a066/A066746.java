package irvine.oeis.a066;

import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A066746 Conjectured values of a(n) defined by a(n) = least number of applications of f(k) = k^2 + 1 to n to yield a prime, if this number exists; = -1 otherwise.
 * @author Sean A. Irvine
 */
public class A066746 extends Sequence1 {

  private long mN = 0;

  private Z f(final Z n) {
    return n.square().add(1);
  }

  @Override
  public Z next() {
    Z t = Z.valueOf(++mN);
    long cnt = 0;
    while (!t.isProbablePrime()) {
      ++cnt;
      t = f(t);
    }
    return Z.valueOf(cnt);
  }
}

