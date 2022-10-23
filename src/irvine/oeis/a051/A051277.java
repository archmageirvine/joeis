package irvine.oeis.a051;

import irvine.math.padic.PAdic;
import irvine.math.padic.PAdicField;
import irvine.math.z.Z;
import irvine.oeis.Sequence0;

/**
 * A051277 Coefficients in 7-adic expansion of sqrt(2).
 * @author Sean A. Irvine
 */
public class A051277 extends Sequence0 {

  private final PAdic mA = new PAdicField(7).sqrt(PAdic.create(7, 2));
  private int mN = -1;

  @Override
  public Z next() {
    return Z.valueOf(mA.get(++mN));
  }
}
