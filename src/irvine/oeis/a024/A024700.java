package irvine.oeis.a024;

import irvine.math.z.Z;
import irvine.oeis.a000.A000040;

/**
 * A024700 a(n) = (p^2 - 1)/3, where p = prime(n+2).
 * @author Sean A. Irvine
 */
public class A024700 extends A000040 {

  {
    super.next(); // skip 2
    super.next(); // skip 3
  }

  @Override
  public Z next() {
    return super.next().square().subtract(1).divide(3);
  }
}
