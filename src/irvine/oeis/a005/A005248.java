package irvine.oeis.a005;

import irvine.math.z.Z;
import irvine.oeis.a000.A000032;

/**
 * A005248.
 * @author Sean A. Irvine
 */
public class A005248 extends A000032 {

  @Override
  public Z next() {
    final Z lucas = super.next();
    super.next();
    return lucas;
  }
}
