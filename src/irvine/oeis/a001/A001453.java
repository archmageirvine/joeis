package irvine.oeis.a001;

import irvine.math.z.Z;
import irvine.oeis.a000.A000108;

/**
 * A001453 Catalan numbers <code>- 1</code>.
 * @author Sean A. Irvine
 */
public class A001453 extends A000108 {

  {
    next();
    next();
  }

  @Override
  public Z next() {
    return super.next().subtract(1);
  }
}
