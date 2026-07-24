package irvine.oeis.a395;

import irvine.math.function.Functions;
import irvine.math.z.Z;
import irvine.oeis.Sequence0;

/**
 * A395815 Number of perfect matchings in the complete tripartite graph K_{2n,2n,2n}.
 * @author Sean A. Irvine
 */
public class A395815 extends Sequence0 {

  private long mN = -1;

  @Override
  public Z next() {
    return Functions.BINOMIAL.z(2 * ++mN, mN).multiply(Functions.FACTORIAL.z(mN)).pow(3);
  }
}
