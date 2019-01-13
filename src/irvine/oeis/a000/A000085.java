package irvine.oeis.a000;

import irvine.math.z.Z;
import irvine.oeis.a013.A013989;

/**
 * A000085.
 * @author Sean A. Irvine
 */
public class A000085 extends A013989 {

  @Override
  public Z next() {
    return super.next().divide(mN + 1);
  }
}

