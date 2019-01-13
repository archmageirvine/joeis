package irvine.oeis.a007;

import irvine.math.z.Z;
import irvine.oeis.a000.A000427;
import irvine.oeis.a000.A000428;

/**
 * A007330.
 * @author Sean A. Irvine
 */
public class A007330 extends A000427 {

  private final A000428 mP = new A000428();

  @Override
  public Z next() {
    return mP.next().subtract(super.next());
  }
}
