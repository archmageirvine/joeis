package irvine.oeis.a389;

import irvine.math.z.Z;
import irvine.oeis.Sequence0;

/**
 * A389430 Number of nodes on a hexagonal lattice where the side lengths increase in this pattern: (x, x, x, x, x, x) -&gt; (x+1, x, x, x+1, x, x) -&gt; (x+1, x, x+1, x, x+1, x) -&gt; (x+1, x+1, x, x+1, x+1, x) -&gt; (x+1, x+1, x+1, x+1, x+1, x+1).
 * @author Sean A. Irvine
 */
public class A389430 extends Sequence0 {

  private long mN = -1;

  @Override
  public Z next() {
    ++mN;
    return Z.valueOf(((mN - 1) / 4) * ((mN + 3) / 4) * 3 + 1 + (((mN + 3) / 4) * (1 + ((mN - 1) & 3)) - 1) * Math.min((mN - 1) & 3, 1));
  }
}
