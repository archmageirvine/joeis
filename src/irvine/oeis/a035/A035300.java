package irvine.oeis.a035;

import irvine.math.z.Z;
import irvine.oeis.a000.A000041;

/**
 * A035300 Expansion of Sum_{n&gt;=0} (q^n / Product_{k=1..n+4} (1 - q^k)).
 * @author Sean A. Irvine
 */
public class A035300 extends A000041 {

  {
    super.next();
    super.next();
    super.next();
    super.next();
  }

  @Override
  public Z next() {
    return super.next().subtract(Z.valueOf(mN + 3).square().add(6).divide(12));
  }
}

