package irvine.oeis.a058;

import irvine.math.function.Functions;
import irvine.math.z.InverseEuler;
import irvine.math.z.Z;
import irvine.oeis.Sequence0;

/**
 * A058214 Sum of solutions of phi(x) = 2^n.
 * @author Sean A. Irvine
 */
public class A058214 extends Sequence0 {

  private Z mN = null;

  @Override
  public Z next() {
    mN = mN == null ? Z.ONE : mN.multiply2();
    return Functions.SUM.z(InverseEuler.inversePhi(mN));
  }
}

