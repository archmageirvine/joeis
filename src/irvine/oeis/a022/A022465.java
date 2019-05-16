package irvine.oeis.a022;

import irvine.math.z.Z;
import irvine.oeis.a000.A000040;

/**
 * A022465 Numbers n such that <code>prime(n) mod n &lt;= 10</code>.
 * @author Sean A. Irvine
 */
public class A022465 extends A000040 {

  private long mN = 0;

  @Override
  public Z next() {
    while (true) {
      final Z p = super.next();
      if (p.mod(++mN) <= 10) {
        return Z.valueOf(mN);
      }
    }
  }
}
