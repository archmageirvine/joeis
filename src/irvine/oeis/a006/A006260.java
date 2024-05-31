package irvine.oeis.a006;

import irvine.math.function.Functions;
import irvine.math.z.Z;
import irvine.oeis.Sequence3;

/**
 * A006260 Second-order Eulerian numbers &lt;&lt;n,3&gt;&gt;.
 * @author Sean A. Irvine
 */
public class A006260 extends Sequence3 {

  private long mN = 2;

  @Override
  public Z next() {
    return Functions.EULERIAN2.z(++mN, 3L);
  }
}

