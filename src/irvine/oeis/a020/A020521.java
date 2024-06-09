package irvine.oeis.a020;

import irvine.math.function.Functions;
import irvine.math.z.Z;
import irvine.oeis.Sequence0;

/**
 * A020521 13th cyclotomic polynomial evaluated at powers of 2.
 * @author Sean A. Irvine
 */
public class A020521 extends Sequence0 {

  private int mN = -1;

  @Override
  public Z next() {
    return Functions.CYCLOTOMIC.z(13, Z.ONE.shiftLeft(++mN));
  }
}
