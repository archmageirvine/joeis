package irvine.oeis.a000;

import irvine.math.z.Binomial;
import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A000891 a(n) = (2*n)!*(2*n+1)! / (n! * (n+1)!)^2.
 * @author Sean A. Irvine
 */
public class A000891 implements Sequence {

  private int mN = -1;

  @Override
  public Z next() {
    final int t = 2 * ++mN + 1;
    return Binomial.binomial(t, mN).square().divide(t);
  }
}

