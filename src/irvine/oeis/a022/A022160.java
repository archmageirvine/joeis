package irvine.oeis.a022;

import irvine.math.cr.CR;
import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A022160 First column of spectral array W(e-1).
 * @author Sean A. Irvine
 */
public class A022160 extends Sequence1 {

  private static final CR N = CR.E.subtract(CR.ONE);

  private long mN = 0;

  @Override
  public Z next() {
    return N.multiply(CR.valueOf(N.multiply(++mN).floor())).floor();
  }
}
