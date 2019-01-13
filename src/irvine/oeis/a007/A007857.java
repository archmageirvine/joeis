package irvine.oeis.a007;

import irvine.math.z.Z;
import irvine.oeis.a000.A000108;

/**
 * A007857.
 * @author Sean A. Irvine
 */
public class A007857 extends A007226 {

  private final A000108 mC = new A000108();

  @Override
  public Z next() {
    return super.next().subtract(mC.next());
  }
}
