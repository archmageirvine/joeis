package irvine.oeis.a014;

import irvine.math.z.Z;
import irvine.oeis.a022.A022843;
import irvine.oeis.a054.A054385;

/**
 * A014246 a(n) = (n-th term of Beatty sequence for e) - (n-th term of Beatty sequence for e/(e-1)).
 * @author Sean A. Irvine
 */
public class A014246 extends A022843 {

  private final A054385 mA = new A054385();
  {
    super.next();
  }

  @Override
  public Z next() {
    return super.next().subtract(mA.next());
  }
}
