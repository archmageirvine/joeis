package irvine.oeis.a005;

import irvine.math.z.Binomial;
import irvine.math.z.Z;

/**
 * A005335 Number of labeled nonseparable (or 2-connected) bipartite graphs with 2n nodes and n nodes in each part.
 * @author Sean A. Irvine
 */
public class A005335 extends A005334 {

  @Override
  public Z next() {
    return super.next().multiply(Binomial.binomial(2L * mN, mN)).divide2();
  }
}
