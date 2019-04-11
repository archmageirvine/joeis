package irvine.oeis.a016;

import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A016061 <code>a(n) = n*(n+1)*(4*n+5)/6</code>.
 * @author Sean A. Irvine
 */
public class A016061 implements Sequence {

  private long mN = -1;

  @Override
  public Z next() {
    return Z.valueOf(++mN).multiply(mN + 1).multiply(4 * mN + 5).divide(6);
  }
}
