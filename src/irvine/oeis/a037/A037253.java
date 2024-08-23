package irvine.oeis.a037;

import irvine.math.z.Z;
import irvine.oeis.Sequence0;

/**
 * A037253 a(n) = n^12*(n^8+n^4+1)*(n^6-1)*(n^2-1).
 * @author Sean A. Irvine
 */
public class A037253 extends Sequence0 {

  private Z mN = Z.NEG_ONE;

  @Override
  public Z next() {
    mN = mN.add(1);
    final Z n2 = mN.square();
    final Z n4 = n2.square();
    final Z n6 = n4.multiply(n2);
    final Z n8 = n4.square();
    final Z n12 = n6.square();
    return n12.multiply(n8.add(n4).add(1)).multiply(n6.subtract(1)).multiply(n2.subtract(1));
  }
}

