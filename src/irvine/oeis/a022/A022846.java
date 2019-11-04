package irvine.oeis.a022;

import irvine.math.cr.CR;
import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A022846 Nearest integer to <code>n*sqrt(2)</code>.
 * @author Sean A. Irvine
 */
public class A022846 implements Sequence {

  private long mN = -1;

  @Override
  public Z next() {
    return CR.SQRT2.multiply(++mN).round();
  }
}
