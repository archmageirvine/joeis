package irvine.oeis.a053;

import irvine.math.z.Z;
import irvine.oeis.a000.A000290;

/**
 * A053061 a(n) is the decimal concatenation of n and n^2.
 * @author Sean A. Irvine
 */
public class A053061 extends A000290 {

  {
    setOffset(1);
    super.next();
  }

  @Override
  public Z next() {
    final Z s = super.next();
    return new Z(mN + s.toString());
  }
}
