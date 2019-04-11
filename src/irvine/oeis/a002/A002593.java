package irvine.oeis.a002;

import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A002593 <code>a(n) = n^2*(2*n^2 - 1)</code>; also Sum_{k=0..n-1} (2k+1)^3.
 * @author Sean A. Irvine
 */
public class A002593 implements Sequence {

  private Z mN = Z.NEG_ONE;

  @Override
  public Z next() {
    mN = mN.add(1);
    final Z n2 = mN.square();
    return n2.multiply(n2.multiply2().subtract(1));
  }
}
