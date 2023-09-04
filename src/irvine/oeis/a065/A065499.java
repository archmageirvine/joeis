package irvine.oeis.a065;

import irvine.math.z.Z;
import irvine.oeis.a064.A064767;

/**
 * A065499 Noninvertible 3 X 3 matrices over Z_n.
 * @author Sean A. Irvine
 */
public class A065499 extends A064767 {

  private long mN = 0;

  @Override
  public Z next() {
    return Z.valueOf(++mN).pow(9).subtract(super.next());
  }
}
