package irvine.oeis.a001;

import irvine.math.cr.CR;
import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A001953 Floor((n + 1/2) * sqrt(2)).
 * @author Sean A. Irvine
 */
public class A001953 implements Sequence {

  private long mN = -1;

  @Override
  public Z next() {
    return CR.SQRT2.multiply(CR.valueOf(++mN).add(CR.HALF)).floor(32);
  }
}
