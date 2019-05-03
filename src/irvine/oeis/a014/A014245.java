package irvine.oeis.a014;

import irvine.math.z.Z;
import irvine.oeis.a022.A022838;
import irvine.oeis.a054.A054406;

/**
 * A014245 <code>(n-th</code> term of Beatty sequence for <code>(3+sqrt(3))/2) - (n-th</code> term of Beatty sequence for <code>sqrt(3))</code>.
 * @author Sean A. Irvine
 */
public class A014245 extends A054406 {

  private final A022838 mA = new A022838();

  @Override
  public Z next() {
    return super.next().subtract(mA.next());
  }
}
