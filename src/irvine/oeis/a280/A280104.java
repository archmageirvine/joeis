package irvine.oeis.a280;

import irvine.math.function.Functions;
import irvine.math.z.Z;
import irvine.oeis.a000.A000032;

/**
 * A280104 a(n) = smallest prime factor of n-th Lucas number A000032(n), or 1 if there are none.
 * @author Georg Fischer
 */
public class A280104 extends A000032 {

  @Override
  public Z next() {
    return Functions.LPF.z(super.next());
  }
}
