package irvine.oeis.a007;

import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A007584 9-gonal (or enneagonal) pyramidal numbers: <code>a(n) = n*(n+1)*(7*n-4)/6</code>.
 * @author Sean A. Irvine
 */
public class A007584 implements Sequence {

  private long mN = 0;

  @Override
  public Z next() {
    return Z.valueOf(mN).multiply(++mN).multiply(7 * mN - 11).divide(6);
  }
}
