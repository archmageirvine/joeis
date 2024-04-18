package irvine.oeis.a068;

import irvine.math.function.Functions;
import irvine.math.z.Z;
import irvine.oeis.a000.A000040;

/**
 * A068210 n-th prime's factorial raised to n-th prime power.
 * @author Sean A. Irvine
 */
public class A068210 extends A000040 {

  @Override
  public Z next() {
    final Z p = super.next();
    return Functions.FACTORIAL.z(p).pow(p);
  }
}

