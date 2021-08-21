package irvine.oeis.a050;

import irvine.math.z.Z;
import irvine.oeis.a000.A000142;

/**
 * A050923 a(n) = 2^(n!).
 * @author Sean A. Irvine
 */
public class A050923 extends A000142 {

  @Override
  public Z next() {
    return Z.ONE.shiftLeft(super.next().intValueExact());
  }
}
