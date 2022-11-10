package irvine.oeis.a181;

import irvine.math.z.Z;
import irvine.oeis.a002.A002321;

/**
 * A181587 If n is even, a(n) = 0, if n is odd, a(n) = A002321(n), where A002321 is Mertens's function.
 * @author Georg Fischer
 */
public class A181587 extends A002321 {

  private int mN = 0;

  @Override
  public Z next() {
    ++mN;
    final Z result = super.next();
    return ((mN & 1) == 0) ? Z.ZERO : result;
  }
}
