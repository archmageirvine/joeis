package irvine.oeis.a089;

import irvine.math.Mobius;
import irvine.math.z.Z;
import irvine.oeis.a000.A000040;

/**
 * A089451 a(n) = mu(prime(n)-1), where mu is the Moebius function (A008683).
 * @author Sean A. Irvine
 */
public class A089451 extends A000040 {

  @Override
  public Z next() {
    return Z.valueOf(Mobius.mobius(super.next().longValueExact() - 1));
  }
}

