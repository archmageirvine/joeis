package irvine.oeis.a092;

import irvine.math.function.Functions;
import irvine.math.z.Z;
import irvine.oeis.a011.A011545;

/**
 * A092845 A011545(n) reversed.
 * @author Sean A. Irvine
 */
public class A092845 extends A011545 {

  @Override
  public Z next() {
    return Functions.REVERSE.z(super.next());
  }
}
