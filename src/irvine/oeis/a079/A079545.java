package irvine.oeis.a079;

import irvine.math.z.Z;
import irvine.oeis.a001.A001481;

/**
 * A079545 Primes of the form x^2 + y^2 + 1 with x,y &gt;= 0.
 * @author Sean A. Irvine
 */
public class A079545 extends A001481 {

  @Override
  public Z next() {
    while (true) {
      final Z t = super.next().add(1);
      if (t.isProbablePrime()) {
        return t;
      }
    }
  }
}

