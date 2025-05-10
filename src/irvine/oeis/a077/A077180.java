package irvine.oeis.a077;

import irvine.math.z.Z;
import irvine.oeis.Sequence;
import irvine.oeis.a000.A000040;
import irvine.oeis.a007.A007908;

/**
 * A077180 Smallest concatenation of integers starting from 1 that is a multiple of the n-th prime.
 * @author Sean A. Irvine
 */
public class A077180 extends A000040 {

  @Override
  public Z next() {
    final Z p = super.next();
    final Sequence seq = new A007908();
    while (true) {
      final Z s = seq.next();
      if (s.mod(p).isZero()) {
        return s;
      }
    }
  }
}

