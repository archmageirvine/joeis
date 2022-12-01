package irvine.oeis.a060;

import irvine.math.cr.CR;
import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A060563 First n digits after decimal point in the expansion of sqrt(n), or 0 if n is a square. Leading zeros omitted.
 * @author Sean A. Irvine
 */
public class A060563 extends Sequence1 {

  private long mN = 0;
  private Z mT = Z.ONE;

  @Override
  public Z next() {
    mT = mT.multiply(10);
    return CR.valueOf(++mN).sqrt().multiply(mT).floor().mod(mT);
  }
}

