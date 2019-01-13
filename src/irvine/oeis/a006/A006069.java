package irvine.oeis.a006;

import irvine.math.z.Z;
import irvine.oeis.a003.A003042;

/**
 * A006069.
 * @author Sean A. Irvine
 */
public class A006069 extends A003042 {

  private int mN = 0;

  @Override
  public Z next() {
    return super.next().shiftLeft(++mN);
  }
}

