package irvine.oeis.a083;

import irvine.math.cr.CR;
import irvine.math.z.Z;
import irvine.oeis.Sequence0;

/**
 * A083051 First column of table A083050.
 * @author Sean A. Irvine
 */
public class A083051 extends Sequence0 {

  private static final CR C = CR.SQRT2.divide(CR.SQRT2.subtract(1));
  private int mN = -1;

  @Override
  public Z next() {
    return C.multiply(++mN).floor().add(1);
  }
}

