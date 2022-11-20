package irvine.oeis.a060;

import irvine.math.z.Z;
import irvine.oeis.a003.A003418;

/**
 * A060401 a(n) = minimal m such that m&gt;n, n divides m, n-1 divides m-1, n-2 divides m-2 and so on down to 1 divides m-n+1.
 * @author Sean A. Irvine
 */
public class A060401 extends A003418 {

  {
    setOffset(1);
    super.next();
  }

  @Override
  public Z next() {
    return super.next().add(mN);
  }
}

