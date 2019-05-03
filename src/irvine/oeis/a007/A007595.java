package irvine.oeis.a007;

import irvine.math.z.Binomial;
import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A007595 <code>a(n) = C_n / 2</code> if n is even or <code>( C_n + C_((n-1)/2) ) / 2</code> if n is odd, where C = Catalan numbers <code>(A000108)</code>.
 * @author Sean A. Irvine
 */
public class A007595 implements Sequence {

  private long mN = 0;

  @Override
  public Z next() {
    ++mN;
    if ((mN & 1) == 0) {
      return Binomial.catalan(mN).divide2();
    } else {
      return Binomial.catalan(mN).add(Binomial.catalan(mN / 2)).divide2();
    }
  }
}
