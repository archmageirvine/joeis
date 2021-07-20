package irvine.oeis.a002;

import irvine.math.z.Z;
import irvine.oeis.a001.A001934;

/**
 * A002318 Expansion of (1/theta_4(q)^2 -1)/4 in powers of q.
 * @author Sean A. Irvine
 */
public class A002318 extends A001934 {

  {
    super.next();
  }

  @Override
  public Z next() {
    return super.next().divide(4);
  }
}
