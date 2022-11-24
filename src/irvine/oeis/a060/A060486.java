package irvine.oeis.a060;

import irvine.math.z.Z;
import irvine.oeis.a188.A188445;

/**
 * A060486 Tricoverings of an n-set.
 * @author Sean A. Irvine
 */
public class A060486 extends A188445 {

  private int mN = -1;
  {
    setOffset(0);
  }

  @Override
  public Z next() {
    return t(3, ++mN);
  }
}
