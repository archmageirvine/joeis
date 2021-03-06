package irvine.oeis.a040;

import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A040081.
 * @author Sean A. Irvine
 */
public class A040081 implements Sequence {

  private long mN = 0;

  @Override
  public Z next() {
    Z n = Z.valueOf(++mN);
    long m = 0;
    while (!n.subtract(1).isProbablePrime()) {
      n = n.multiply2();
      ++m;
    }
    return Z.valueOf(m);
  }
}
