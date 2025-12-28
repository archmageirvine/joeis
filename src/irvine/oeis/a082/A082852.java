package irvine.oeis.a082;

import irvine.math.z.Z;
import irvine.oeis.Sequence0;

/**
 * A082852 a(0)=0, a(n) = A014137(A072643(n)-1).
 * @author Sean A. Irvine
 */
public class A082852 extends Sequence0 {

  // After Peter Luschny

  private long mN = -1;

  @Override
  public Z next() {
    ++mN;
    Z c = Z.ZERO;
    long i = 0;
    Z a = Z.ONE;
    while (c.compareTo(mN) < 0) {
      a = a.multiply(4 * i + 2).divide(2 + i);
      ++i;
      c = c.add(a);
    }
    return c.subtract(a).add(1);
  }
}
