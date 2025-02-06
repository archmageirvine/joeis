package irvine.oeis.a075;

import irvine.math.z.Z;
import irvine.oeis.Sequence;
import irvine.oeis.Sequence1;
import irvine.oeis.a007.A007908;

/**
 * A075002 a(n) = smallest k such that A007908(k) is divisible by n.
 * @author Sean A. Irvine
 */
public class A075002 extends Sequence1 {

  private long mN = 0;

  @Override
  public Z next() {
    ++mN;
    long k = 0;
    final Sequence s = new A007908();
    while (true) {
      ++k;
      if (s.next().mod(mN) == 0) {
        return Z.valueOf(k);
      }
    }
  }
}

