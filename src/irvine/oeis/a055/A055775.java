package irvine.oeis.a055;

import irvine.math.z.Z;
import irvine.oeis.Sequence;
import irvine.oeis.a000.A000142;
import irvine.oeis.a000.A000312;

/**
 * A055775 a(n) = floor(n^n / n!).
 * @author Sean A. Irvine
 */
public class A055775 extends A000312 {

  private final Sequence mA = new A000142();

  @Override
  public Z next() {
    return super.next().divide(mA.next());
  }
}
