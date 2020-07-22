package irvine.oeis.a033;

import irvine.math.z.Z;
import irvine.oeis.a000.A000142;

/**
 * A033932 Least positive m such that <code>n!+m</code> is prime.
 * @author Sean A. Irvine
 */
public class A033932 extends A000142 {

  @Override
  public Z next() {
    final Z f = super.next();
    long k = 0;
    while (true) {
      if (f.add(++k).isProbablePrime()) {
        return Z.valueOf(k);
      }
    }
  }
}
