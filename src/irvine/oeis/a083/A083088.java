package irvine.oeis.a083;

import irvine.math.cr.CR;
import irvine.math.z.Z;
import irvine.oeis.Sequence0;

/**
 * A083051.
 * @author Sean A. Irvine
 */
public class A083088 extends Sequence0 {

  private static final CR C = CR.SQRT2.add(1).divide(CR.SQRT2);
  private long mN = -1;

  @Override
  public Z next() {
    return C.multiply(++mN).floor().add(1);
  }
}

