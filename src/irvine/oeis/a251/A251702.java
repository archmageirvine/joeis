package irvine.oeis.a251;

import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A251702 a(1)=5, a(n)=a(n-1)*(a(n-1)-1)*(a(n-1)-2)/6.
 * @author Georg Fischer
 */
public class A251702 implements Sequence {

  protected int mN = 0;
  protected Z mA_1 = Z.FIVE;

  @Override
  public Z next() {
    final Z result = mA_1;
    ++mN;
    mA_1 = mA_1.multiply(mA_1.subtract(1)).multiply(mA_1.subtract(2)).divide(6);
    return result;
  }
}
