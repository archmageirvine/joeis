package irvine.oeis.a003;

import irvine.math.z.Z;
import irvine.oeis.a058.A058876;

/**
 * A003026 Number of n-node acyclic digraphs with <code>2 out-points</code>.
 * @author Sean A. Irvine
 */
public class A003026 extends A058876 {

  private int mN = 1;

  @Override
  public Z next() {
    return get(++mN, 2);
  }
}
