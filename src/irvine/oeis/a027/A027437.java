package irvine.oeis.a027;

import irvine.math.cr.CR;
import irvine.math.z.Z;
import irvine.oeis.Sequence0;

/**
 * A027437 a(n) = floor( e * 2^n ).
 * @author Sean A. Irvine
 */
public class A027437 extends Sequence0 {

  private int mN = -1;

  @Override
  public Z next() {
    return CR.E.multiply(Z.ONE.shiftLeft(++mN)).floor();
  }
}
