package irvine.oeis.a289;

import irvine.math.z.Z;
import irvine.oeis.a066.A066395;

/**
 * A289210 Coefficients in expansion of E_6^2/E_4^3.
 * a(n) = -1728 * A066395(n) for n &gt; 0.
 * @author Georg Fischer
 */
public class A289210 extends A066395 {

  private int mN = -1;

  @Override
  public Z next() {
    return (++mN == 0) ? Z.ONE : super.next().multiply(-1728);
  }
}
