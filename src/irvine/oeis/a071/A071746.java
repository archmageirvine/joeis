package irvine.oeis.a071;

import irvine.math.z.Z;
import irvine.oeis.a213.A213261;

/**
 * A071746 a(n) = p(7n+5)/7 where p(k) denotes the k-th partition number.
 * @author Georg Fischer
 */
public class A071746 extends A213261 {

  @Override
  public Z next() {
    return super.next().divide(Z.SEVEN);
  }
}
