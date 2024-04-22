package irvine.oeis.a001;

import irvine.math.function.Functions;
import irvine.math.z.Z;
import irvine.oeis.Sequence0;

/**
 * A001947 a(n) = Lucas(5*n+2).
 * @author Sean A. Irvine
 */
public class A001947 extends Sequence0 {

  private int mN = -3;

  @Override
  public Z next() {
    mN += 5;
    return Functions.LUCAS.z((long) mN);
  }
}
