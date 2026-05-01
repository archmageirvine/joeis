package irvine.oeis.a395;

import irvine.math.z.Binomial;
import irvine.math.z.Z;
import irvine.oeis.Sequence0;

/**
 * A395396 a(n) = binomial(n,floor(n/2)) + (n mod 2) - 2.
 * @author Sean A. Irvine
 */
public class A395396 extends Sequence0 {

  private long mN = -1;

  @Override
  public Z next() {
    return Binomial.binomial(++mN, mN / 2).add((mN & 1) - 2);
  }
}
