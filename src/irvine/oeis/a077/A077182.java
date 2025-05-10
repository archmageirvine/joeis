package irvine.oeis.a077;

import irvine.math.z.Z;
import irvine.oeis.Sequence;
import irvine.oeis.a000.A000040;
import irvine.oeis.a007.A007908;

/**
 * A077182 Smallest number k such that the concatenation of natural numbers from 1 to k is divisible by the prime(n).
 * @author Sean A. Irvine
 */
public class A077182 extends A000040 {

  @Override
  public Z next() {
    long k = 0;
    final Z p = super.next();
    final Sequence seq = new A007908();
    while (true) {
      ++k;
      final Z s = seq.next();
      if (s.mod(p).isZero()) {
        return Z.valueOf(k);
      }
    }
  }
}

