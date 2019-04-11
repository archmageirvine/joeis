package irvine.oeis.a001;

import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A001793 <code>a(n) = n*(n+3)*2^(n-3)</code>.
 * @author Sean A. Irvine
 */
public class A001793 implements Sequence {

  private int mN = 0;

  @Override
  public Z next() {
    return Z.valueOf(++mN).multiply(mN + 3).shiftLeft(mN - 3);
  }
}
