package irvine.oeis.a034;

import irvine.math.cr.CR;
import irvine.math.z.Z;
import irvine.oeis.Sequence0;

/**
 * A034887 Number of digits in 2^n.
 * @author Sean A. Irvine
 */
public class A034887 extends Sequence0 {

  private static final CR LOG = CR.TWO.log10();
  private long mN = -1;

  @Override
  public Z next() {
    return LOG.multiply(++mN).floor().add(1);
  }
}

