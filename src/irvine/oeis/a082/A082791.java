package irvine.oeis.a082;

import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A082791 Smallest k such that k*n begins with 2: a(n) = A082811(n)/n.
 * @author Sean A. Irvine
 */
public class A082791 extends Sequence1 {

  private long mN = 0;

  @Override
  public Z next() {
    ++mN;
    long k = 0;
    while (true) {
      if (String.valueOf(mN * ++k).charAt(0) == '2') {
        return Z.valueOf(k);
      }
    }
  }
}
