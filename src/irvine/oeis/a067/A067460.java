package irvine.oeis.a067;

import irvine.math.function.Functions;
import irvine.math.z.Z;
import irvine.oeis.a000.A000040;

/**
 * A067460 a(n) = mu(prime(n)-1)+1.
 * @author Sean A. Irvine
 */
public class A067460 extends A000040 {

  @Override
  public Z next() {
    return Z.valueOf(Functions.MOBIUS.i(super.next().longValueExact() - 1) + 1);
  }
}

