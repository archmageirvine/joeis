package irvine.oeis.a006;

import irvine.math.z.Z;
import irvine.oeis.a000.A000005;

/**
 * A006590 a(n) = Sum_{k=1..n} ceiling(n/k).
 * @author Sean A. Irvine
 */
public class A006590 extends A000005 {

  private Z mA = null;

  @Override
  public Z next() {
    mA = mA == null ? Z.ONE : mA.add(super.next()).add(1);
    return mA;
  }
}
