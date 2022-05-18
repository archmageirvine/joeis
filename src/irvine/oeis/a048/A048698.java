package irvine.oeis.a048;

import irvine.factor.factor.Jaguar;
import irvine.math.z.Z;
import irvine.oeis.a018.A018252;

/**
 * A048698 Nonprime numbers k such that sum of aliquot divisors of k is a cube.
 * @author Sean A. Irvine
 */
public class A048698 extends A018252 {

  @Override
  public Z next() {
    while (true) {
      final Z a = super.next();
      final Z t = Jaguar.factor(a).sigma().subtract(a);
      t.root(3);
      if (t.auxiliary() == 1) {
        return a;
      }
    }
  }
}

