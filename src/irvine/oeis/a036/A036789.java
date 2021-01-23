package irvine.oeis.a036;

import irvine.math.z.Z;
import irvine.oeis.a022.A022821;

/**
 * A036789 a(n) = Sum_{i=0..n} floor((2*i + 2)/(n - i + 1)).
 * @author Sean A. Irvine
 */
public class A036789 extends A022821 {

  @Override
  public Z next() {
    return super.next().subtract(mN - 1);
  }
}
