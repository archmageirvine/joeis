package irvine.oeis.a046;

import irvine.math.z.Z;

/**
 * A046282 Numbers n such that n is a prime and sum of all lucky numbers &lt;= n is a prime.
 * @author Sean A. Irvine
 */
public class A046282 extends A046280 {

  @Override
  public Z next() {
    while (true) {
      final Z t = super.next();
      if (t.isProbablePrime()) {
        return t;
      }
    }
  }
}
