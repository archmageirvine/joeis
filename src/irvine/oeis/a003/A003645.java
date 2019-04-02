package irvine.oeis.a003;

import irvine.math.z.Z;
import irvine.oeis.a000.A000108;

/**
 * A003645 2^n * C(n+1), where C(n) = A000108(n) Catalan numbers.
 * @author Sean A. Irvine
 */
public class A003645 extends A000108 {

  private int mN = -1;

  {
    super.next();
  }

  @Override
  public Z next() {
    return super.next().shiftLeft(++mN);
  }
}
