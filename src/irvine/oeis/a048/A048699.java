package irvine.oeis.a048;

import irvine.factor.factor.Cheetah;
import irvine.math.z.Z;
import irvine.oeis.a018.A018252;

/**
 * A048699 Nonprime numbers whose sum of aliquot divisors (A001065) is a perfect square.
 * @author Sean A. Irvine
 */
public class A048699 extends A018252 {

  @Override
  public Z next() {
    while (true) {
      final Z a = super.next();
      if (Cheetah.factor(a).sigma().subtract(a).isSquare()) {
        return a;
      }
    }
  }
}

