package irvine.oeis.a024;

import irvine.math.z.Z;
import irvine.oeis.a000.A000583;

/**
 * A024002 <code>a(n) = 1 - n^4</code>.
 * @author Sean A. Irvine
 */
public class A024002 extends A000583 {

  @Override
  public Z next() {
    return Z.ONE.subtract(super.next());
  }
}
