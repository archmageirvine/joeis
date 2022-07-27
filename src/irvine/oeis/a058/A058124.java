package irvine.oeis.a058;

import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A058124 n^(n^n)-(n^n)^n with 0^0=1.
 * @author Sean A. Irvine
 */
public class A058124 implements Sequence {

  private long mN = -1;

  @Override
  public Z next() {
    final Z n = Z.valueOf(++mN);
    final Z nn = n.pow(n);
    return n.pow(nn).subtract(nn.pow(n));
  }
}
