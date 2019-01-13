package irvine.oeis.a010;

import irvine.math.z.Z;
import irvine.oeis.a000.A000598;

/**
 * A010373.
 * @author Sean A. Irvine
 */
public class A010373 extends A000598 {

  {
    super.next();
  }

  @Override
  public Z next() {
    final Z b = super.next();
    return b.multiply(b.add(1)).divide2();
  }
}
