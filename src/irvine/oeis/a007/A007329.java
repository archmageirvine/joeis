package irvine.oeis.a007;

import irvine.math.z.Z;
import irvine.oeis.a000.A000416;
import irvine.oeis.a000.A000417;

/**
 * A007329.
 * @author Sean A. Irvine
 */
public class A007329 extends A000416 {

  private final A000417 mP = new A000417();

  @Override
  public Z next() {
    return mP.next().subtract(super.next());
  }
}
