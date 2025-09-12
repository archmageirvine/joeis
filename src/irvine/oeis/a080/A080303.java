package irvine.oeis.a080;

import irvine.math.z.Z;
import irvine.oeis.Sequence0;

/**
 * A080303 Rewrite 0-&gt;100 in the binary expansion of n.
 * @author Sean A. Irvine
 */
public class A080303 extends Sequence0 {

  private long mN = -1;

  @Override
  public Z next() {
    return new Z(Long.toString(++mN, 2).replace("0", "100"), 2);
  }
}

