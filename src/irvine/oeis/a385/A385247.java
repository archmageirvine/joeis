package irvine.oeis.a385;

import irvine.math.z.Z;
import irvine.oeis.a386.A386296;

/**
 * A384479.
 * @author Sean A. Irvine
 */
public class A385247 extends A386296 {

  private int mN = 0;

  @Override
  public Z next() {
    return t(++mN, 6);
  }
}

