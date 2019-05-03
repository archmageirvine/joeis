package irvine.oeis.a009;

import irvine.math.z.Binomial;
import irvine.math.z.Z;
import irvine.oeis.a006.A006987;

/**
 * A009561 Index of central binomial coefficient <code>C(2n,n)</code> within <code>A006987</code>.
 * @author Sean A. Irvine
 */
public class A009561 extends A006987 {

  private long mN = 1;
  private long mC = 0;

  @Override
  public Z next() {
    ++mN;
    final Z target = Binomial.binomial(2 * mN, mN);
    Z v;
    do {
      v = super.next();
      ++mC;
    } while (!v.equals(target));
    return Z.valueOf(mC);
  }
}
