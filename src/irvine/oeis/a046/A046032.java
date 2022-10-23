package irvine.oeis.a046;

import irvine.math.z.Z;
import irvine.oeis.a000.A000142;

/**
 * A046032 a(n) = (n!)^2 - 1.
 * @author Sean A. Irvine
 */
public class A046032 extends A000142 {

  {
    setOffset(1);
    super.next();
  }

  @Override
  public Z next() {
    return super.next().square().subtract(1);
  }
}
