package irvine.oeis.a000;

import irvine.math.z.Z;
import irvine.oeis.a047.A047863;

/**
 * A000683.
 * @author Sean A. Irvine
 */
public class A000683 extends A047863 {

  {
    super.next();
  }

  @Override
  public Z next() {
    return super.next().subtract(2).shiftRight(2);
  }
}
