package irvine.oeis.a282;

import irvine.math.z.Z;
import irvine.oeis.Sequence0;
import irvine.oeis.a037.A037947;
import irvine.oeis.a281.A281959;

/**
 * A282048 Coefficients in q-expansion of E_4^5*E_6, where E_4 and E_6 are respectively the Eisenstein series A004009 and A013973.
 * @author Georg Fischer
 */
public class A282048 extends Sequence0 {

  private int mN = -1;
  private final A281959 mSeq1 = new A281959();
  private final A037947 mSeq2 = new A037947();

  @Override
  public Z next() {
    return (++mN == 0) ? Z.ONE : mSeq1.next().multiply(-24).add(mSeq2.next().multiply(457920000L)).divide(657931);
  }
}
