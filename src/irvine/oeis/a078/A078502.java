package irvine.oeis.a078;

import irvine.math.z.Z;
import irvine.oeis.Sequence;
import irvine.oeis.Sequence1;
import irvine.oeis.a003.A003418;

/**
 * A078502 a(n) = smallest positive integer N such that (N - k)/k is prime for k = 1, 2, ..., n.
 * @author Sean A. Irvine
 */
public class A078502 extends Sequence1 {

  private final Sequence mL = new A003418().skip();
  private long mN = 0;

  private boolean is(final Z k) {
    for (long j = 1; j <= mN; ++j) {
      if (!k.subtract(j).divide(j).isProbablePrime()) {
        return false;
      }
    }
    return true;
  }

  @Override
  public Z next() {
    ++mN;
    final Z lcm = mL.next();
    Z k = lcm;
    while (true) {
      if (is(k)) {
        return k;
      }
      k = k.add(lcm);
    }
  }
}

