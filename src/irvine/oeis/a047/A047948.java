package irvine.oeis.a047;

import irvine.math.z.Z;
import irvine.oeis.a000.A000040;

/**
 * A0347948.
 * @author Sean A. Irvine
 */
public class A047948 extends A000040 {

  @Override
  public Z next() {
    while (true) {
      final Z p = super.next();
      final Z q = mFast.nextPrime(p);
      if (q.equals(p.add(6)) && mFast.nextPrime(q).equals(p.add(12))) {
        return p;
      }
    }
  }
}
