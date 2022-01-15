package irvine.oeis.a053;

import irvine.math.z.Z;
import irvine.oeis.a025.A025475;

/**
 * A053704 Prime powers p^w (w &gt;= 2) such that p^w-2 is prime.
 * @author Sean A. Irvine
 */
public class A053704 extends A025475 {

  @Override
  public Z next() {
    while (true) {
      final Z a = super.next();
      if (a.subtract(2).isProbablePrime()) {
        return a;
      }
    }
  }
}
