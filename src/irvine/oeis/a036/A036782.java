package irvine.oeis.a036;

import irvine.math.z.Z;
import irvine.oeis.a003.A003422;

/**
 * A036782 a(n) = n - 1 + Sum_{j=0..n} j!.
 * @author Sean A. Irvine
 */
public class A036782 extends A003422 {

  {
    super.next();
  }

  @Override
  public Z next() {
    return super.next().add(mN - 1);
  }
}
