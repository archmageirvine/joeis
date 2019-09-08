package irvine.oeis.a025;

import irvine.math.z.Z;
import irvine.oeis.a003.A003418;

/**
 * A025555 Least common multiple (or LCM) of first n positive triangular numbers <code>(A000217)</code>.
 * @author Sean A. Irvine
 */
public class A025555 extends A003418 {

  {
    super.next();
    super.next();
  }

  @Override
  public Z next() {
    return super.next().divide2();
  }
}
