package irvine.oeis.a390;

import irvine.math.z.Z;
import irvine.oeis.a389.A389336;

/**
 * A390508 allocated for Clark Kimberling.
 * @author Sean A. Irvine
 */
public class A390508 extends A390505 {

  private final A390509 mNa = new A390509();
  private final A389336 mCode = new A389336();

  @Override
  public Z next() {
    return Z.valueOf(mCode.decode(mNa.nextNa().toString()));
  }
}
