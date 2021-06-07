package irvine.oeis.a005;

import irvine.math.z.Z;
import irvine.oeis.a003.A003586;

/**
 * A005105 Class 1+ primes: primes of the form 2^i*3^j - 1 with i, j &gt;= 0.
 * @author Sean A. Irvine
 */
public class A005105 extends A003586 {


  @Override
  public Z next() {
    while (true) {
      final Z t = super.next().subtract(1);
      if (t.isProbablePrime()) {
        return t;
      }
    }
  }
}
