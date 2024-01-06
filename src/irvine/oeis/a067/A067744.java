package irvine.oeis.a067;

import irvine.math.cr.CR;
import irvine.math.q.Q;
import irvine.math.z.Z;
import irvine.oeis.Sequence2;

/**
 * A067744 Number of terms yielding particularly small errors in a numerical integration of exp((cos(x)-1)/(cos(x)+1)) having non-monotonic sub-geometric convergence.
 * @author Sean A. Irvine
 */
public class A067744 extends Sequence2 {

  private static final CR C = CR.TAU.divide(CR.valueOf(27).sqrt());
  private static final Q D = new Q(3, 2);
  private long mN = 1;

  @Override
  public Z next() {
    return C.multiply(CR.valueOf(new Q(6 * ++mN - 5, 6))).pow(D).round();
  }
}
