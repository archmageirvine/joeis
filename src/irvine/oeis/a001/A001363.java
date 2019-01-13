package irvine.oeis.a001;

import irvine.math.z.Z;
import irvine.oeis.a000.A000040;

/**
 * A001363.
 * @author Sean A. Irvine
 */
public class A001363 extends A000040 {

  @Override
  public Z next() {
    return new Z(super.next().toString(3));
  }
}
