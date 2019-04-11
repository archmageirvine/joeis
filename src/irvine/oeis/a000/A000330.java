package irvine.oeis.a000;

import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A000330 Square pyramidal numbers: <code>a(n) = 0^2 + 1^2 + 2^2 + ... + n^2 = n*(n+1)*(2*n+1)/6</code>.
 * @author Sean A. Irvine
 */
public class A000330 implements Sequence {

  protected long mN = -1;

  @Override
  public Z next() {
    final Z n = Z.valueOf(++mN);
    return n.multiply(mN + 1).multiply(2 * mN + 1).divide(6);
  }
}

