package irvine.oeis.a046;

import irvine.math.z.Z;
import irvine.oeis.a000.A000142;

/**
 * A046033 a(n) = (n!)^3 - 1.
 * @author Sean A. Irvine
 */
public class A046033 extends A000142 {

  {
    super.next();
  }

  @Override
  public Z next() {
    return super.next().pow(3).subtract(1);
  }
}
