package irvine.oeis.a022;

import irvine.math.cr.CR;
import irvine.math.q.Q;
import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A022162 First column of spectral array W(sqrt(3/2)).
 * @author Sean A. Irvine
 */
public class A022162 extends Sequence1 {

  private static final CR N = CR.valueOf(new Q(3, 2)).sqrt();

  private long mN = 0;

  @Override
  public Z next() {
    return N.multiply(CR.valueOf(N.multiply(++mN).floor())).floor();
  }
}
