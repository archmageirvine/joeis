package irvine.oeis.a007;

import irvine.math.z.Z;
import irvine.oeis.a000.A000334;
import irvine.oeis.a000.A000335;

/**
 * A007327.
 * @author Sean A. Irvine
 */
public class A007327 extends A000334 {

  private final A000335 mP = new A000335();

  @Override
  public Z next() {
    return mP.next().subtract(super.next());
  }
}
