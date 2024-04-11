package irvine.oeis.a020;

import irvine.math.z.Z;
import irvine.math.cyclotomic.Cyclotomic;
import irvine.oeis.Sequence0;

/**
 * A020519 11th cyclotomic polynomial evaluated at powers of 2.
 * @author Sean A. Irvine
 */
public class A020519 extends Sequence0 {

  private int mN = -1;

  @Override
  public Z next() {
    return Cyclotomic.cyclotomic(11, Z.ONE.shiftLeft(++mN));
  }
}
