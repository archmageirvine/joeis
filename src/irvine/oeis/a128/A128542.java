package irvine.oeis.a128;

import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A128542 a(n) = ((2n)^(2n) - 1)/((2n+1)*(2n-1)).
 * @author Georg Fischer
 */
public class A128542 implements Sequence {

  private int mN = -1;

  @Override
  public Z next() {
    ++mN;
    final long n2 = 2 * mN;
    return Z.valueOf(n2).pow(n2).subtract(1).divide(n2 * n2 - 1);
  }
}
