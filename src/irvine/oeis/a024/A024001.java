package irvine.oeis.a024;

import irvine.math.z.Z;
import irvine.oeis.a000.A000578;

/**
 * A024001 a(n) = 1-n^3.
 * @author Sean A. Irvine
 */
public class A024001 extends A000578 {

  @Override
  public Z next() {
    return Z.ONE.subtract(super.next());
  }
}
