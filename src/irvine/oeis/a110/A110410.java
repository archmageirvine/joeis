package irvine.oeis.a110;

import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A110410 a(1) = 10, a(n+1) = {a(n) followed by digit reversal(a(n))}/11.
 * @author Georg Fischer
 */
public class A110410 implements Sequence {

  private Z mA = Z.TEN;

  @Override
  public Z next() {
    final Z result = mA;
    final String sa = mA.toString();
    mA = new Z(sa + new StringBuilder(sa).reverse()).divide(11);
    return result;
  }
}
