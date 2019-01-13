package irvine.oeis.a008;

import irvine.math.z.Z;
import irvine.oeis.a000.A000040;

/**
 * A008864.
 * @author Sean A. Irvine
 */
public class A008864 extends A000040 {

  @Override
  public Z next() {
    return super.next().add(1);
  }
}

