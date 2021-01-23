package irvine.oeis.a014;

import irvine.math.z.Z;
import irvine.oeis.a022.A022838;
import irvine.oeis.a054.A054406;

/**
 * A014245 a(n) = (n-th term of Beatty sequence for (3+sqrt(3))/2) - (n-th term of Beatty sequence for sqrt(3)).
 * @author Sean A. Irvine
 */
public class A014245 extends A054406 {

  private final A022838 mA = new A022838();

  @Override
  public Z next() {
    return super.next().subtract(mA.next());
  }
}
