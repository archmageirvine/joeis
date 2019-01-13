package irvine.oeis.a038;

import irvine.math.z.Z;
import irvine.oeis.a000.A000005;

/**
 * A038548.
 * @author Sean A. Irvine
 */
public class A038548 extends A000005 {

  @Override
  public Z next() {
    return super.next().add(1).divide2();
  }
}

