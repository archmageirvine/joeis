package irvine.oeis.a028;

import irvine.math.z.Z;
import irvine.oeis.a000.A000722;

/**
 * A028370 <code>a(n) = (2^(n-1))!*2^(2^(n-1)-1)</code>.
 * @author Sean A. Irvine
 */
public class A028370 extends A000722 {

  private int mN = -1;

  @Override
  public Z next() {
    return super.next().shiftLeft(Z.ONE.shiftLeft(++mN).intValueExact() - 1);
  }
}
