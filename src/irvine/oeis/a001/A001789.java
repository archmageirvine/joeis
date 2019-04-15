package irvine.oeis.a001;

import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A001789 <code>a(n) = binomial(n,3)*2^(n-3)</code>.
 * @author Sean A. Irvine
 */
public class A001789 implements Sequence {

  private int mN = 2;

  @Override
  public Z next() {
    return Z.valueOf(++mN).multiply(mN - 1).multiply(mN - 2).divide(3).shiftLeft(mN - 4);
  }
}
