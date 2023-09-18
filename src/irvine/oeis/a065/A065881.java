package irvine.oeis.a065;

import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A065881 Ultimate modulo 10: right-hand nonzero digit of n.
 * @author Sean A. Irvine
 */
public class A065881 extends Sequence1 {

  private long mN = 0;

  @Override
  public Z next() {
    long m = ++mN;
    while (m % 10 == 0) {
      m /= 10;
    }
    return Z.valueOf(m % 10);
  }
}
