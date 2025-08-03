package irvine.oeis.a094;

import irvine.math.cr.CR;
import irvine.math.z.Z;
import irvine.oeis.Sequence0;

/**
 * A094057 Number of decimal digits of Lucas(2^n).
 * @author Georg Fischer
 */
public class A094057 extends Sequence0 {

  private static final CR C = CR.PHI.log10();
  private int mN = -1;

  @Override
  public Z next() {
    return C.multiply(Z.ONE.shiftLeft(++mN)).floor().add(1);
  }
}
