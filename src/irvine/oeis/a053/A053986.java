package irvine.oeis.a053;

import irvine.math.z.Z;
import irvine.oeis.a000.A000142;

/**
 * A053986 a(n) = n^(n!).
 * @author Sean A. Irvine
 */
public class A053986 extends A000142 {

  @Override
  public Z next() {
    final Z f = super.next();
    return Z.valueOf(mN).pow(f);
  }
}
