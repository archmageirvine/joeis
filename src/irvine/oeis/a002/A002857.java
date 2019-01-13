package irvine.oeis.a002;

import irvine.math.z.Z;
import irvine.oeis.a000.A000612;

/**
 * A002857.
 * @author Sean A. Irvine
 */
public class A002857 extends A000612 {

  {
    super.next();
  }

  @Override
  public Z next() {
    return super.next().divide2();
  }
}
