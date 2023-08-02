package irvine.oeis.a054;

import irvine.math.z.Z;
import irvine.oeis.a003.A003027;

/**
 * A054593 Number of disconnected labeled digraphs with n nodes.
 * @author Sean A. Irvine
 */
public class A054593 extends A003027 {

  @Override
  public Z next() {
    final int n = size();
    return Z.ONE.shiftLeft((long) n * (n - 1)).subtract(super.next());
  }
}
