package irvine.oeis.a364;

import irvine.math.function.Functions;
import irvine.math.z.Z;
import irvine.oeis.a000.A000129;

/**
 * A364820 a(n) is the smallest prime factor of the n-th Pell number A000129(n).
 * @author Sean A. Irvine
 */
public class A364820 extends A000129 {

  {
    super.next();
    super.next();
    setOffset(2);
  }

  @Override
  public Z next() {
    return Functions.LPF.z(super.next());
  }
}
