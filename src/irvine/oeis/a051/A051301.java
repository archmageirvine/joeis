package irvine.oeis.a051;

import irvine.math.function.Functions;
import irvine.math.z.Z;
import irvine.oeis.a000.A000142;

/**
 * A051301 Smallest prime factor of n!+1.
 * @author Sean A. Irvine
 */
public class A051301 extends A000142 {

  @Override
  public Z next() {
    return Functions.LPF.z(super.next().add(1));
  }
}
