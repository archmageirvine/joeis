package irvine.oeis.a007;

import irvine.math.z.Z;
import irvine.oeis.a000.A000390;
import irvine.oeis.a000.A000391;

/**
 * A007328.
 * @author Sean A. Irvine
 */
public class A007328 extends A000390 {

  private final A000391 mP = new A000391();

  @Override
  public Z next() {
    return mP.next().subtract(super.next());
  }
}
